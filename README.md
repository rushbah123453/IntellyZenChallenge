# IntellyZenChallenge
coding challenge for IntellyZen aws intern


Problem Statements
We're going to make our own E-Commerce Cart application! Candidates are expected to
implement a Command Line Program. The application must perform three types of
operations.


1. add <product>, where product is a string denoting a product name. This must
store product as a new product in the application.
2. find <partial>, where partial is a string denoting a partial name of product to search the
cart for. It must count the number of products starting with partial and print the count
on a new line.
3. list items, which prints all the products in the cart.
Input Format
Upon running the program, it should display an empty prompt where the user can type in
either of the three operations:
- add <product>
- find <partial string to search>
- list items
  
  
Constraints
• It is guaranteed that product and partial search string product contain lowercase
English letters only.
• The input doesn't have any duplicate product for the add operation.
• product length should be between 1 and 30.
• partial search length should be between 1 and 30.


Output Format
For each find partial operation, print the number of product names starting with partial on a
new line
