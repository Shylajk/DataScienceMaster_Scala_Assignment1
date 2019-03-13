// Databricks notebook source
/* TASK - 2
Given a list of strings - List[String] (“alpha”, “gamma”, “omega”, “zeta”, “beta”)

 1.  find count of all strings with length 4
 2.  convert the list of string to a list of integers, where each string is mapped to its corresponding length
 3.  find count of all strings which contain alphabet ‘m’
 4.  find the count of all strings which start with the alphabet ‘a’
*/

// COMMAND ----------

//Create List
val list =  List[String] ("alpha", "gamma", "omega", "zeta", "beta")


// COMMAND ----------

// 1.  find count of all strings with length 4
println(list.filter(s => s.length == 4))
println(list.count(s => s.length == 4))

// COMMAND ----------

//2.  convert the list of string to a list of integers, where each string is mapped to its corresponding length
println(list.map(s => (s.length)))
println(list.map(s => (s, s.length)))

// COMMAND ----------

// find count of all strings which contain alphabet ‘m’ 
list.map(s => s.count(_ == 'm')).count(s => s != 0)

// COMMAND ----------

// - find the count of all strings which start with the alphabet ‘a’ 
list.map(s => s(0) == 'a').count(s => s == true) 


// COMMAND ----------

//TASK -3 Create a Scala application to find the GCD of two numbers.
//Defining a class and method to calculate GCD
object GCD 
{ 
     def gcd(a: Int,b: Int): Int = { 
        if(b ==0) a else gcd(b, a%b) 
     } 
       
     def main(args: Array[String]) { 
         println("gcd of " + args(0) + " and " + args(1) + " is : " + gcd(args(0).toInt,args(1).toInt)) 
     } 
 } 


// COMMAND ----------

//Calling the method GCD
GCD.gcd(20,35)

// COMMAND ----------

GCD.gcd(21,35)

// COMMAND ----------


