// Return the set of products that were ordered by every customer
fun Shop.getSetOfProductsOrderedByEveryCustomer(): Set<Product> {
    return customers.fold(customers.flatMap { it.orders.flatMap { it -> it.products } }.toSet()) { partProducts : Set<Product>, element ->
        partProducts.intersect(element.orders.flatMap { it.products })
    }
}