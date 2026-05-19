# Java vs. Python: Loop Performance Comparison

This repository contains two simple scripts (one in Python, one in Java) that execute a basic `while` loop 100 million times. The goal is to demonstrate the core architectural differences in execution speed between the two languages.

## Performance Results
Generally, the **Java** implementation runs significantly faster than **Python**. 

## Why is Java Faster in this Scenario?

1. **Static vs. Dynamic Typing:** Python checks the data type of the variables on every single iteration of the loop. Java defines the variable type upfront, skipping all type-checking overhead during execution.
2. **JIT Compilation vs. Interpretation:** Python interprets and executes the loop line-by-line. Java utilizes a **Just-In-Time (JIT) Compiler** to detect the heavy loop and compile it directly into native machine code for the CPU.
3. **Primitive Types vs. Objects:** Python treats integers as complex objects requiring memory allocation. Java uses **primitive types** (`int`), which are raw numbers processed directly inside CPU registers.


# Java vs. Python: Loop Performance Benchmarking

A simple performance comparison tracking execution speed differences between Java and Python using a 100-million iteration loop.

## 📊 Benchmark Overview

The objective of this project is to demonstrate how underlying language architecture, memory management, and compilation strategies impact execution speed in computationally heavy tasks. Both scripts execute an identical mathematical task: running a `while` loop from 0 to 100,000,000 (100 Million) and tracking the total elapsed time.

### Code Implementations

#### Python Implementation (`main.py`)
```python
import time

def main():
    start_time = time.time()
    
    count = 0
    max_value = 100_000_000  # 100 Million
    
    while count < max_value:
        count += 1
        
    end_time = time.time()
    elapsed_time = end_time - start_time
    
    print(f"Python finished in: {elapsed_time:.4f} seconds")

if __name__ == "__main__":
    main()

Java


public class Main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        
        int count = 0;
        int maxValue = 100_000_000; // 100 Million
        
        while (count < maxValue) {
            count++;
        }
        
        long endTime = System.currentTimeMillis();
        double elapsedTime = (endTime - startTime) / 1000.0;
        
        System.out.println("Java finished in: " + elapsedTime + " seconds");
    }
}
