# PERSON API PERSISTENCE CRUD

The purpose of this project is to work as a library

### Endpoints

- Get list of persons `/person` as `GET`
- Update a person by Id `/person/{personId}` as `PUT`
  - `personId` is a Integer variable
  - body must be like person object
- Save a person `/person/` as `POST`
  - body must be like person object
- Delete a person `/person/{personId}` as `DELETE`
  - `personId` is a Integer variable
    
# Model

- A `person` model has next attributes
  - `name` as String value
  - `lastName` as String value
  - `phoneNumber` as String value
  - `email` as String value
  - `bornDate` as String value
  - `height` as Float value

```json
{
  "name": "joel",
  "lastName": "medina",
  "phoneNumber": "12345678910",
  "email": "jmedina@domain.com",
  "bornDate": "1998-03-05",
  "height": 1.75
}
```