# Week 01 Student Starter

## This week you will practice
- first program, main, printing, compile/run cycle
- Working from chapter `ch01` examples without editing the canonical book code
- Turning a small scaffold into a finished exercise

## Starter file
- `src/Week01HelloStarter.java`

## What to do
- Replace the placeholder text with your own information.
- Add at least two more lines of output.
- Compile and run the file from the week folder.

## Practice extension
- Trace the output of the three hello examples.
- Change a printed message and re-run the program.

## Deliverables
- Your completed `src/Week01HelloStarter.java`
- A short note describing one bug you fixed or one idea you understood better this week
- Any extra files your instructor asks you to submit

## Success check
- I can explain what the program is supposed to do.
- I ran the file after making changes.
- I can point to one line I changed and explain why.

## Chapter 1 Code Examples

### Example 1: `Chapter1EscapeSequences.java`

```java
public class Chapter1EscapeSequences {
    public static void main(String[] args) {
        // Demonstration of various Java escape sequences
        System.out.println("=== Computer Science 101: Chapter 1 Reading Checklist ===");
        System.out.println("1. Core Concepts:\n\t- \"System.out.println()\"\n\t- \"Syntax Errors\"");
        System.out.println("2. File Path Example:\n\tC:\\JavaProjects\\Chapter1\\HelloWorld.java");
    }
}

/* 
================================================================================
PROGRAM OUTPUT:
================================================================================
=== Computer Science 101: Chapter 1 Reading Checklist ===
1. Core Concepts:
	- "System.out.println()"
	- "Syntax Errors"
2. File Path Example:
	C:\JavaProjects\Chapter1\HelloWorld.java

================================================================================
VERIFICATION & EXPLANATION:
================================================================================
* Newline (\n): Breaks the line to place sub-items on new rows.
* Tab (\t): Indents bullet points for visual hierarchy.
* Escaped Quote (\"): Displays literal double quotes around Java terms.
* Escaped Backslash (\\): Correctly prints backslashes in Windows file paths.
================================================================================
*/
```

### Example 2: `Chapter1Concatenation.java`

```java
public class Chapter1Concatenation {
    public static void main(String[] args) {
        int chapter1Pages = 25;
        int chapter2Pages = 30;

        // Without parentheses: values are concatenated as text from left to right
        System.out.println("Total pages without grouping: " + chapter1Pages + chapter2Pages);

        // With parentheses: arithmetic addition occurs first before string concatenation
        System.out.println("Total pages with grouping: " + (chapter1Pages + chapter2Pages));
    }
}

/* 
================================================================================
PROGRAM OUTPUT:
================================================================================
Total pages without grouping: 2530
Total pages with grouping: 55

================================================================================
VERIFICATION & EXPLANATION:
================================================================================
* String Concatenation (+): When a string is added to an integer without 
  grouping, Java evaluates from left to right and converts the integers to 
  text, resulting in "25" + "30" = "2530".
* Operator Precedence (): Parentheses force numerical addition (25 + 30 = 55) 
  to occur before the result is concatenated with the text label.
================================================================================
*/
```
