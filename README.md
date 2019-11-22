# SmartShoppingCart
assignment for ADP 

Problem statement : - Build a core java application to checkout counter for an online retail store that scan products and generates an itemized bill. 
The bill should also total the cost of all the products and the applicable sales tax for each product. 
The total cost and total sales tax should be printed. 
Sales tax varies based on the type of products. 
• Category A products carry a levy 10%. 
• Category B products carry a levy 20%. 

Solution :- 
    1) Created a simple java pojo class for product which contains id,name,cost and category attributes 
    2) Created driver class which will do the checkout .
    3) It will ask from user how many items they want to checkout . Based on that , it will accept different product listings . 
    4) On accepting , it will check if user is providing given category right by matching it with java regex pattern . 
    5) After that , it will calculate the total cost and sales tax total separately in two different methods and combining the result . 
    6) Print total cost for checkout items and also total sales tax upon them . 
    7) Used Junit test cases for the above functionality 
    8) Used Logger to print results and exceptions 
    9) Handled method specific exception and logs them in console . 
    10) can use QR code scanner , but due to unavailabity of biometric device , I have to opt for main method using list of products as parameter . 
 

