package APITesting;

public class CompareDropDwnAPI {


    public static void main(String[] args) {
        /*
        Validating dropdown values in **API automation** is a common real-world scenario — for example, if your frontend dropdown (country list, state list, status values, etc.) is populated by an API.

### Typical workflow:

✅ You fetch the dropdown values via API
✅ You compare them against the expected list (which might come from requirements, DB, or static file)

---

### Steps to validate dropdown values:

1️⃣ **Call the API that provides dropdown values**

Example:

```http
GET /api/v1/countries
Response:
{
    "countries": ["India", "USA", "UK", "Germany"]
}
```

---

2️⃣ **Define expected values**

Usually in code or from a static data source:

```java
List<String> expectedCountries = Arrays.asList("India", "USA", "UK", "Germany");
```

---

3️⃣ **Extract actual values from API response**

Using **RestAssured**:

```java
Response response = given()
    .when()
    .get("/api/v1/countries")
    .then()
    .statusCode(200)
    .extract()
    .response();

List<String> actualCountries = response.jsonPath().getList("countries");
```

---

4️⃣ **Compare actual vs expected**

✅ Simple comparison:

```java
Assert.assertEquals(actualCountries, expectedCountries);
```

✅ Order-independent comparison (commonly used for dropdowns):

```java
Assert.assertTrue(actualCountries.containsAll(expectedCountries)
    && expectedCountries.containsAll(actualCountries));
```

✅ Using **Hamcrest** (more readable):

```java
assertThat(actualCountries, containsInAnyOrder(expectedCountries.toArray()));
```

---

### Real-time scenarios where this is used:

✅ Country/state/city dropdowns
✅ User role dropdown
✅ Status values (Active, Inactive, Pending)
✅ Product category dropdown
✅ Payment modes dropdown

---

### Common interview questions:

👉 How do you validate dropdown values if values change dynamically?
👉 What if API gives more/less values than UI expects?
👉 How do you validate localization (different languages)?
👉 How do you validate sorted order?

---

### Bonus tip:

✅ If your frontend uses a **different source** (DB, config), compare API values to **DB values** — for full coverage.

---

If you want, I can also provide a **full example** framework-ready (RestAssured + TestNG + Cucumber) code snippet to validate dropdown values — would you like to see it? 🚀

         */
    }
}
