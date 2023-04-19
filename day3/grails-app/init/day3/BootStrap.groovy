package day3

class BootStrap {

    def init = { servletContext ->
        new Product(0,1000,10000L,'Pencil',50).save()

    }
    def destroy = {
    }
}
