package day3

class InventoryController {

    def index() {
        render "Rocking with Inventory Controller"
    }
    def edit() {
       def productName="Laptop"
       def cost=85000
        [name:productName,cost:cost]

    }

    def list() {
       def allProducts=Product.list()
        [allProducts:allProducts]
    }
    def delete() {
        render "Delete Item from Inventory"
    }
}
