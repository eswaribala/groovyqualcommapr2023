package day3

import grails.gorm.services.Service
import groovy.transform.CompileStatic
import groovy.util.logging.Slf4j
import org.springframework.scheduling.annotation.Scheduled

import java.text.SimpleDateFormat

@Slf4j
@CompileStatic
@Service
class InventoryJob {



        static lazyInit = false

        @Scheduled(initialDelayString = "PT15S")
        void executeEveryTen() {
            log.info "Simple Job every 10 seconds :{}", new SimpleDateFormat("dd/M/yyyy hh:mm:ss").format(new Date())
        }

        @Scheduled(fixedDelay = 45L, initialDelay = 5L)
        void executeEveryFourtyFive() {
            log.info "Simple Job every 45 seconds :{}", new SimpleDateFormat("dd/M/yyyy hh:mm:ss").format(new Date())
        }

}
