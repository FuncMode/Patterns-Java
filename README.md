# Patterns-Java

[![Java](https://img.shields.io/badge/Java-11%2B-blue?logo=java)](https://www.oracle.com/java/)

A simple Java project demonstrating basic pattern printing programs. These examples showcase how to use loops and control structures in Java to generate geometric patterns like triangles and hollow squares using asterisks (`*`).

## Table of Contents
- [Overview](#overview)
- [Features](#features)
- [Getting Started](#getting-started)
- [Usage](#usage)
- [Files](#files)
- [Examples](#examples)
- [Contributing](#contributing)
- [License](#license)

## Overview
This repository contains beginner-friendly Java programs for printing common patterns. It's ideal for learning Java fundamentals such as:
- Nested loops (`for`, `while`)
- Conditional statements (`if-else`)
- String manipulation for output formatting

The patterns include solid and hollow shapes, helping to build intuition for algorithmic thinking.

## Features
- **Simple and Readable Code**: Each program is concise and well-commented.
- **Console-Based Output**: Runs directly in any Java environment.
- **Extensible**: Easy to modify for custom sizes or characters.

## Getting Started
### Prerequisites
- Java Development Kit (JDK) 11 or higher installed.
- A Java IDE like IntelliJ IDEA, Eclipse, or VS Code with Java extensions (optional).

### Installation
1. Clone the repository:
   ```
   git clone https://github.com/FuncMode/Patterns-Java.git
   ```
2. Navigate to the project directory:
   ```
   cd Patterns-Java
   ```
3. Compile the Java files:
   ```
   javac *.java
   ```

## Usage
Run any program from the command line:
```
java Triangle
java InvertedTriangle
java SquareHollowPattern
```
Each program will prompt for input (e.g., pattern size) or use a default value.

## Files
| File Name                  | Description                          |
|----------------------------|--------------------------------------|
| `Triangle.java`           | Prints a right-angled solid triangle pattern. |
| `InvertedTriangle.java`   | Prints an inverted right-angled solid triangle pattern. |
| `SquareHollowPattern.java`| Prints a hollow square pattern with borders. |

## Examples

### Triangle Pattern (Size: 5)
```
*
**
***
****
*****
```

### Inverted Triangle Pattern (Size: 5)
```
*****
****
***
**
*
```

### Square Hollow Pattern (Size: 5)
```
*****
*   *
*   *
*   *
*****
```

## Contributing
Contributions are welcome! Please feel free to submit a Pull Request for:
- New pattern implementations (e.g., diamond, pyramid).
- Bug fixes or optimizations.
- Documentation improvements.

1. Fork the project.
2. Create your feature branch (`git checkout -b feature/AmazingFeature`).
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`).
4. Push to the branch (`git push origin feature/AmazingFeature`).
5. Open a Pull Request.

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details (or add one if not present). 

---

*Built with ❤️ by FuncMode*  
[Star this repo](https://github.com/FuncMode/Patterns-Java) if it helps you! 🚀
