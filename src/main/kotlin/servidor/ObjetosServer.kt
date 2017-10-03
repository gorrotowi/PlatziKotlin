package servidor

data class Persona(val name: String, val age: Int)
data class Error(val code: Int, val message: String)

data class Producto(val id: Int,
                    val name: String,
                    val desc: String,
                    val descLong: String,
                    val price: Double,
                    val imgUrl: String)

data class ResponseJson(val statusCode: Int, val payload: Any)
