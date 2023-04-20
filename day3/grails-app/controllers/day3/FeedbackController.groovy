package day3


import grails.plugin.springsecurity.annotation.Secured
//import grails.plugins.rest.client.RestBuilder
import grails.validation.ValidationException
import groovy.util.logging.Slf4j
import grails.rest.*
import org.springframework.web.client.RestTemplate

import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse

import static org.springframework.http.HttpStatus.CREATED
@Slf4j
class FeedbackController {
    FeedbackService feedbackService
    //RestTemplate restTemplate

    @Secured(['ROLE_ADMIN', 'ROLE_USER'])
    def create() {

        log.info("Entering create action...")
        respond new Feedback(params)
    }

    @Secured(['ROLE_ADMIN', 'ROLE_USER'])
    def save(Feedback feedback){
        if (feedback == null) {

            return
        }

        try {
            feedbackService.save(feedback)
        } catch (ValidationException e) {
            respond feedback.errors, view:'create'
            return
        }
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'feedback.label', default: 'Feedback'), feedback.firstName])
                redirect feedback
            }
            '*' { respond feedback, [status: CREATED] }
        }
    }
    @Secured(['ROLE_ADMIN', 'ROLE_USER'])
    def show(Long id) {
        respond feedbackService.get(id)
    }
    @Secured(['ROLE_ADMIN', 'ROLE_USER'])
    def index(Integer max){
        params.max = Math.min(max ?: 10, 100)
        //RestBuilder rest = new RestBuilder(connectTimeout: 10000, readTimeout: 100000, proxy: null)
       // def resp = rest.get("https://jsonplaceholder.typicode.com/users")
       //s resp.json //would give the response JSON
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/users"))
                .GET()
                .build();


        HttpResponse response = client.send(request, HttpResponse.BodyHandlers.ofString());
        //restTemplate.get
        respond feedbackService.list(params), model:[feedbackCount: feedbackService.count()]
    }
    @Secured(['ROLE_ADMIN', 'ROLE_USER'])
    def femaleList(){
        def criteria = Feedback.createCriteria()
        List<Feedback> result = criteria.list{
            eq ('gender', 'FEMALE')

        }
        [resultData: result]
    }
}
