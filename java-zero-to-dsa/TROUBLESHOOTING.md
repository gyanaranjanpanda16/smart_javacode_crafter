# When something goes wrong

Errors are feedback. Read the first error first and change one thing at a time.

| What you see | What it means | What to try |
| --- | --- | --- |
| `java: command not found` | The terminal cannot find Java | Check that a JDK is installed and selected in your terminal or IDE. |
| `Could not find ...` or file not found | The file path is wrong | Run the command from `java-zero-to-dsa`; check spelling and capital letters. |
| `';' expected` | A statement may be missing its ending | Check this line and the line immediately before it. |
| `cannot find symbol` | Java does not recognise a name | Check spelling, capitals, and whether the variable was declared. |
| `ArrayIndexOutOfBoundsException` | You used a position outside an array | Valid positions run from 0 to length - 1. |
| `NullPointerException` | You used a missing object | Check where the object should have been created or assigned. |
| `NumberFormatException` | Text was not a valid number | Use digits within the integer range, or handle the error as in lesson 9. |
| `StackOverflowError` | Too many unfinished method calls | Check the recursion stopping case and whether the input is too large. |
| Program appears to wait | It may be reading keyboard input | In lesson 3, type a name and press Enter. Otherwise inspect loop conditions. |
| Output differs | Your input or logic differs | Compare inputs, then trace one instruction at a time on paper. |

## Read a tiny program

```java
int count = 3;                 // create a box named count
count = count + 1;             // replace 3 with 4
System.out.println(count);    // display 4
```

`//` begins a comment for people; Java ignores it. Indentation makes code easier to read. Braces `{ }` group code. Parentheses `( )` hold method arguments or conditions. Square brackets `[ ]` access array positions. Java is case-sensitive: `count` and `Count` are different names.

Use `.equals()` to compare String contents. `==` on objects checks whether the references point to the same object. Integers have limits: use `long` for larger totals, and remember that even `long` can overflow.
