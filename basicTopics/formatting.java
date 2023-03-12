// %d: decimal integer
// %f: floating-point number
// %e or %E: scientific notation for a floating-point number
// %c: character
// %s: string
// %b: boolean
// %n: newline
// %t: date/time formatting (followed by a letter for the type of formatting, such as %tB for the full month name)

// Each format specifier can be followed by optional flags and width and precision specifiers, which control the formatting of the output. Here are some examples:

// %-10s: left-justified string in a field of 10 characters
// %10s: right-justified string in a field of 10 characters
// %03d: integer in a field of 3 characters with leading zeros
// %8.2f: floating-point number with a total width of 8 characters and 2 digits after the decimal point
// You can also use the printf() method to format output with multiple placeholders. Here's an example:

// String name = "Alice";
// int age = 30;
// double salary = 50000.0;
// System.out.printf("Name: %-10s Age: %d Salary: $%,.2f", name, age, salary);
