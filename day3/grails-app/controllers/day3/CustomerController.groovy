package day3

import grails.plugin.springsecurity.annotation.Secured
import grails.validation.ValidationException
import org.hibernate.Criteria

import static org.springframework.http.HttpStatus.*

class CustomerController {

    CustomerService customerService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]
    @Secured(['ROLE_ADMIN', 'ROLE_USER'])
    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond customerService.list(params), model:[customerCount: customerService.count()]
    }
    @Secured(['ROLE_ADMIN', 'ROLE_USER'])
    def show(Long id) {
        respond customerService.get(id)
    }
    @Secured(['ROLE_ADMIN', 'ROLE_USER'])
    def create() {
        respond new Customer(params)
    }
    @Secured(['ROLE_ADMIN', 'ROLE_USER'])
    def save(Customer customer) {
        if (customer == null) {
            notFound()
            return
        }

        try {
            customerService.save(customer)
        } catch (ValidationException e) {
            respond customer.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'customer.label', default: 'Customer'), customer.id])
                redirect customer
            }
            '*' { respond customer, [status: CREATED] }
        }
    }
    @Secured(['ROLE_ADMIN', 'ROLE_USER'])
    def edit(Long id) {
        respond customerService.get(id)
    }
    @Secured(['ROLE_ADMIN', 'ROLE_USER'])
    def update(Customer customer) {
        if (customer == null) {
            notFound()
            return
        }

        try {
            customerService.save(customer)
        } catch (ValidationException e) {
            respond customer.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'customer.label', default: 'Customer'), customer.id])
                redirect customer
            }
            '*'{ respond customer, [status: OK] }
        }
    }
    @Secured(['ROLE_ADMIN', 'ROLE_USER'])
    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        customerService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'customer.label', default: 'Customer'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'customer.label', default: 'Customer'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }

    @Secured(['ROLE_ADMIN', 'ROLE_USER'])
    def customRecord(){
        //check in the break
        //hql query
        def data = Customer.executeQuery(
                'select c.firstName,a.points,o.orderNo from Customer c join c.awards as a join c.orders as o')
        [data:data]
    }
}
