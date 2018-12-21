fun renderProductTable(): String {
    return html {
        table {
            tr (getTitleColor()) {
                td {
                    text("Product")
                }
                td {
                    text("Price")
                }
                td {
                    text("Popularity")
                }
            }
            val products = getProducts()
            for (productIndex in products.indices) {
                tr {
                    td(getCellColor(productIndex, 0)) {
                        text(products[productIndex].description)
                    }
                    td(getCellColor(productIndex, 1)) {
                        text(products[productIndex].price)
                    }
                    td(getCellColor(productIndex, 2)) {
                        text(products[productIndex].popularity)
                    }
                }
            }
        }
    }.toString()
}

fun getTitleColor() = "#b9c9fe"
fun getCellColor(row: Int, column: Int) = if ((row + column) %2 == 0) "#dce4ff" else "#eff2ff"