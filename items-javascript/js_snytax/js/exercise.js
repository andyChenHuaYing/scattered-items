/**
 * Created by andy on 1/11/2015.
 */
var str1 = '12.5';
var num1 = 12.5;
console.info("str1 + num1 : " + (str1 + num1));
console.info("str1 - num1 : " + (str1 - num1));
console.info("str1 * num1 : " + (str1 * num1));
console.info("str1 / num1 : " + (str1 / num1));
console.info("=========================================\r\n");

// string number interconversion
var strFromNum = 12.5 + "";
console.info("strFromNum type : " + typeof strFromNum);
var numFromStr = '12.5' - 0;
console.info(("numFromStr type : " + typeof numFromStr));
console.info("=========================================\r\n");

// == example
var str2 = '25.0';
var str3 = new String('25.0');
var num2 = 25.0;
var num3 = 0;
var num4 = 1;
var booTrue = true;
var booFalse = false;
var arr1 = [1, 2];
var arr2 = [1, 2];
console.info("str2 == str3 : " + (str2 == str3));
console.info("str2 == num2 : " + (str2 == num2));
console.info("str3 == num2 : " + (str3 == num2));
console.info("booTrue == num3 : " + (booTrue == num3));
console.info("booFalse == num4 : " + (booFalse == num4));
console.info("booTrue == 1 : " + (booTrue == 1));
console.info("booFalse == 0 : " + (booFalse == 0));
console.info("arr1 == arr2 : " + (arr1 == arr2));
console.info("null == undefined : " + (null == undefined));
console.info("NaN == NaN : " + (NaN == NaN));
console.info("=========================================\r\n");

// === example
console.info("str2 === str3 : " + (str2 === str3));
console.info("str2 === num2 : " + (str2 === num2));
console.info("str3 === num2 : " + (str3 === num2));
console.info("booTrue === num3 : " + (booTrue === num3));
console.info("booFalse === num4 : " + (booFalse === num4));
console.info("booTrue === 1 : " + (booTrue === 1));
console.info("booFalse === 0 : " + (booFalse === 0));
console.info("arr1 === arr2 : " + (arr1 === arr2));
console.info("null === undefined : " + (null === undefined));
console.info("NaN === NaN : " + (NaN === NaN));
console.info("=========================================\r\n");

/*
 要点：
 1. 基本类型没有属性、方法
 2. 调用基本类型会产生临时包装对象、调用完成之后包装对象就被消耗、此时再想获取基本类型的伪属性就会返回undefined。
 */
var str4 = 'alien';
console.info("str4.length : " + str4.length);
console.info("str4.p : " + (str4.p = 'star'));
console.info("str4.p : " + str4.p);
console.info("=========================================\r\n");

console.info("typeof 1: " + typeof 1);
console.info("typeof '1': " + typeof '1');
console.info("typeof boolean: " + typeof false);
console.info("typeof null: " + typeof null);
console.info("typeof undefined: " + typeof undefined);
console.info("typeof [1, 2]: " + typeof [1, 2]);
console.info("typeof Math: " + typeof Math);
function fun() {
}
console.info("typeof fun: " + typeof fun);
console.info("typeof NaN: " + typeof NaN);
console.info("=========================================\r\n");

console.info("[1, 2] instanceof Array : " + [1, 2] instanceof Array);
function Person() {
}
function Student() {
}
Student.prototype = new Person();
Student.prototype.constructor = Student;
var alien = new Person();
console.info("alien instanceof Person : " + alien instanceof Person);
var student = new Student();
console.info("student instanceof Person : " + student instanceof Person);
console.info("=========================================\r\n");

Object.prototype.toString.apply([]); //"[object Array]"
Object.prototype.toString.apply(function () {
}); //"[object Function]"
Object.prototype.toString.apply(Math); //"[object Math]"
Object.prototype.toString.apply(new Person()); //"[object Object]"
Object.prototype.toString.apply(null); //"[object Null]"
Object.prototype.toString.apply(NaN); //"[object Number]"
Object.prototype.toString.apply('alien'); //"[object String]"
Object.prototype.toString.apply(undefined); //"[object Undefined]"
console.info("=========================================\r\n");
/*
 * Result :

 str1 + num1 : 12.512.5
 str1 - num1 : 0
 str1 * num1 : 156.25
 str1 / num1 : 1
 =========================================

 strFromNum type : string
 numFromStr type : number
 =========================================

 str2 == str3 : true
 str2 == num2 : true
 str3 == num2 : true
 booTrue == num3 : false
 booFalse == num4 : false
 booTrue == 1 : true
 booFalse == 0 : true
 arr1 == arr2 : false
 null == undefined : true
 NaN == NaN : false
 =========================================

 str2 === str3 : false
 str2 === num2 : false
 str3 === num2 : false
 booTrue === num3 : false
 booFalse === num4 : false
 booTrue === 1 : false
 booFalse === 0 : false
 arr1 === arr2 : false
 null === undefined : false
 NaN === NaN : false
 =========================================

 str4.length : 5
 str4.p : star
 str4.p : undefined


 typeof 1: number
 typeof '1': string
 typeof boolean: boolean
 typeof null: object
 typeof undefined: undefined
 typeof [1, 2]: object
 typeof Math: object
 typeof fun: function
 */

