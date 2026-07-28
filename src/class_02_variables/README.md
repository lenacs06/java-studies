# Class 02 — Data Types

## Primitive Data Types
Primitive types are the simplest building blocks of the language.
They store the exact value directly in memory.

| Data Type | Description | Example |
|-----------|-------------|---------|
| `byte` | Whole numbers from -128 to 127 | `byte age = 25;` |
| `short` | Whole numbers from -32,768 to 32,767 | `short year = 2026;` |
| `int` | Whole numbers from -2,147,483,648 to 2,147,483,647 | `int population = 8000000;` |
| `long` | Very large whole numbers | `long distance = 149600000000L;` |
| `float` | Fractional numbers (6 to 7 decimal digits) | `float price = 19.99f;` |
| `double` | Fractional numbers (15 to 16 decimal digits) | `double percentage = 99.856423;` |
| `boolean` | Stores true or false only | `boolean isAlive = true;` |
| `char` | Single character or ASCII value | `char grade = 'A';` |

---

## Non-Primitive Data Types
Non-primitive types are more complex structures that can hold
multiple values together. Instead of storing the value directly,
they store a reference (memory address) pointing to where
the actual data is saved.

| Data Type | Description | Example |
|-----------|-------------|---------|
| `String` | Stores a sequence of characters | `String name = "Helena";` |
| `Array` | Stores multiple values of the same type | `int[] numbers = {1, 2, 3};` |
| `Object` | Base of all non-primitive types in Java | `Object obj = new Object();` |

```java
String name = "Helena";
System.out.println(name.length());      // 6
System.out.println(name.toUpperCase()); // HELENA
```

---

## Key Differences

| | Primitive | Non-Primitive |
|---|---|---|
| Stores | The value itself | A memory reference |
| Can be null | ❌ No | ✅ Yes |
| Has methods | ❌ No | ✅ Yes |
| Starts with | lowercase (`int`) | Uppercase (`String`) |
| Complexity | Simple values | Complex structures |

---

## The var Keyword
Introduced in Java 10, `var` lets Java automatically detect
the variable type, so you don't need to declare it manually.

```java
// Without var
String name = "Helena";
int age = 19;

// With var — Java detects the type automatically
var name = "Helena"; // detected as String
var age = 19;        // detected as int
```

⚠️ Important rules:
- Can only be used inside methods, not as a class field
- The variable **must** be initialized at declaration
- The type cannot change after being set

```java
var name = "Helena";
name = 123; // ❌ error — name is already a String
```

---

## Key Takeaway
> **Primitive types** store simple values directly in memory.
> **Non-primitive types** store a reference to where the data lives,
> and come with built-in methods to help manipulate that data.

---

## Type Casting
Type casting means converting one data type into another.
For example, turning an `int` into a `double`.

### Widening Casting (automatic)
Converting a smaller type to a larger type. Done automatically
because there is no risk of losing data.

```
byte -> short -> char -> int -> long -> float -> double
```

```java
int myInt = 9;
double myDouble = myInt; // automatic casting

System.out.println(myInt);    // 9
System.out.println(myDouble); // 9.0
```

### Narrowing Casting (manual)
Converting a larger type to a smaller type. Must be done manually
because data loss may occur (example: decimals are dropped).

```
double -> float -> long -> int -> char -> short -> byte
```

```java
double myDouble = 9.78d;
int myInt = (int) myDouble; // manual casting

System.out.println(myDouble); // 9.78
System.out.println(myInt);    // 9
```

### Real-Life Example
Calculating a user's score percentage in a game:

```java
int maxScore = 500;
int userScore = 423;

double percentage = (double) userScore / maxScore * 100.0d;

System.out.println("User's percentage is " + percentage); // 84.6
```

> Without `(double)` the division would return `0` because
> two `int` values divided always return an `int` in Java.