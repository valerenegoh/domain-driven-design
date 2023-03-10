#Problem Statement



- Problem#1 : Add a “IPad Pro” to a Cart
`Note: Please do not model/use User class`
- Problem#2: Add a “Hero ink Pen” to a Cart
- Problem#3: Add 2 quantities of “GM Cricket bat” to Cart.
- Problem#4: Remove already added Item “IPad Pro” (`all quantities`) from cart.
- Problem#5: As a business User I would like to know which Product was deleted from Cart.
- Problem#6: As a business User, I would like to differentiate between two Carts.
```
*  Two carts where items are same, equality on Carts should return false
Cart cart1 = Cart()
Cart cart2 = Cart()
Item item1 = new ( Item( Product("Ipad"), 1)
Item item2 = new ( Item( Product("Ipad"), 1)
cart1.add(item1)
cart2.add(item2)
cart1.equals(cart2)  should be false
```
- Problem#7: See the Price of Product before adding to a Cart
`Notes: Java.Util.Currency ==> Currency.getInstance("USD")`
`new Product(Price(...))`
- Problem #8 -  As a Business User I will like price my product 10% below competitor price (competitor price is available for product).
`Assume that HashMap of Competitor Product Name and price is available`
`Product("name", Price())`
- Problem #9  Create Order( with Products) when Cart is checked out. Also, Mark cart as checked out 
- Problem #10 - Customer and Bank Account
  When Customer’s Address is updated, update her all Bank Accounts address as well. (example of invariant or business rules or consistency rules)
`Customer is Entity
Account Is Entity
Customer has List of bank accounts
Customer has Address
Account has Address
Address has one attribute called City
Address is Value Object
----  customer updateAddress(address)`
- Problem #11 - Calculate Total amount for the Order.  put shipping cost as per weight
`Total cost = cost of all products in order + (weightIngrams of each product *.01)`