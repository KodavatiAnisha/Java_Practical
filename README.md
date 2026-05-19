# Java vs. Python: Loop Performance Comparison

This repository contains two simple scripts (one in Python, one in Java) that execute a basic `while` loop 100 million times. The goal is to demonstrate the core architectural differences in execution speed between the two languages.

## Performance Results
Generally, the **Java** implementation runs significantly faster than **Python**. 

## Why is Java Faster in this Scenario?

1. **Static vs. Dynamic Typing:** Python checks the data type of the variables on every single iteration of the loop. Java defines the variable type upfront, skipping all type-checking overhead during execution.
2. **JIT Compilation vs. Interpretation:** Python interprets and executes the loop line-by-line. Java utilizes a **Just-In-Time (JIT) Compiler** to detect the heavy loop and compile it directly into native machine code for the CPU.
3. **Primitive Types vs. Objects:** Python treats integers as complex objects requiring memory allocation. Java uses **primitive types** (`int`), which are raw numbers processed directly inside CPU registers.
