package asciiValue;
public class PrintAscii {

	void getAscii(char startChar, char endChar) {
		for (char ch = startChar; ch <= endChar; ch++) {
			int asciiValue = ch;
			System.out.println("Ascii value of " + ch + " is --->  " + asciiValue);
		}
	}

	public static void main(String[] args) {
		PrintAscii a29 = new PrintAscii();
		a29.getAscii('A', 'Z');
		a29.getAscii('a', 'z');
		a29.getAscii('0', '9');
	}
}

/*
OUTPUT
Ascii value of A is --->  65
Ascii value of B is --->  66
Ascii value of C is --->  67
Ascii value of D is --->  68
Ascii value of E is --->  69
Ascii value of F is --->  70
Ascii value of G is --->  71
Ascii value of H is --->  72
Ascii value of I is --->  73
Ascii value of J is --->  74
Ascii value of K is --->  75
Ascii value of L is --->  76
Ascii value of M is --->  77
Ascii value of N is --->  78
Ascii value of O is --->  79
Ascii value of P is --->  80
Ascii value of Q is --->  81
Ascii value of R is --->  82
Ascii value of S is --->  83
Ascii value of T is --->  84
Ascii value of U is --->  85
Ascii value of V is --->  86
Ascii value of W is --->  87
Ascii value of X is --->  88
Ascii value of Y is --->  89
Ascii value of Z is --->  90
Ascii value of a is --->  97
Ascii value of b is --->  98
Ascii value of c is --->  99
Ascii value of d is --->  100
Ascii value of e is --->  101
Ascii value of f is --->  102
Ascii value of g is --->  103
Ascii value of h is --->  104
Ascii value of i is --->  105
Ascii value of j is --->  106
Ascii value of k is --->  107
Ascii value of l is --->  108
Ascii value of m is --->  109
Ascii value of n is --->  110
Ascii value of o is --->  111
Ascii value of p is --->  112
Ascii value of q is --->  113
Ascii value of r is --->  114
Ascii value of s is --->  115
Ascii value of t is --->  116
Ascii value of u is --->  117
Ascii value of v is --->  118
Ascii value of w is --->  119
Ascii value of x is --->  120
Ascii value of y is --->  121
Ascii value of z is --->  122
Ascii value of 0 is --->  48
Ascii value of 1 is --->  49
Ascii value of 2 is --->  50
Ascii value of 3 is --->  51
Ascii value of 4 is --->  52
Ascii value of 5 is --->  53
Ascii value of 6 is --->  54
Ascii value of 7 is --->  55
Ascii value of 8 is --->  56
Ascii value of 9 is --->  57
*/