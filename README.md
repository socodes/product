# Microservice Product
Developed using Spring Boot of Java
Serves on heroku

Endpoints:

Save Product
```
POST  https://mdidin-product.herokuapp.com/api/product
Host: heroku
Authorization: Basic base64(username:password)
Content-Type: application/json
Content-Length: 42

{
    "name": "test-1",
    "price": 1.2
}
```
Get Products
```
GET https://mdidin-product.herokuapp.com/api/product
Host: heroku
Authorization: Basic base64(username:password)
```
Delete Product
```
DELETE https://mdidin-product.herokuapp.com/api/product/{productId}
Host: heroku
Authorization: Basic base64(username:password)
```
