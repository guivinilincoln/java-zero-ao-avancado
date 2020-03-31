package curso_programacao;

public class FuncoesInteressantesString {
	public static void main(String[] args) {
		
		String original = "abcde FGHIJ ABC abc DEFG ";
		String s01 = original.toLowerCase(); // Convert tudo para minuscula
		String s02 = original.toUpperCase(); // Convert tudo para mainuscula
		String s03 = original.trim(); // Tira os espa�os em branco no come�o e no fim da string
		String s04 = original.substring(2); // Recorta apartir de quando come�a 
		String s05 = original.substring(2, 9); // Recorta de string 2 at� a 9
		String s06 = original.replace('a', 'x'); //Troca o primeiro pelo segundo
		String s07 = original.replace("abc", "xy"); // Troca a palavra abc por xy
		int i = original.indexOf("bc"); //  Traz a posi��o da primeira String com bc
		int j = original.lastIndexOf("bc");  //  Traz a posi��o da ultima String com bc
		
		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim: -" + s03 + "-");
		System.out.println("substring(2): -" + s04 + "-");
		System.out.println("substring(2, 9): -" + s05 + "-");
		System.out.println("replace('a', 'x'): -" + s06 + "-");
		System.out.println("replace('abc', 'xy'): -" + s07 + "-");
		System.out.println("Index of 'bc': " + i);
		System.out.println("Last index of 'bc': " + j);
		
		
		String s = "potato apple lemon";
		String[] vect = s.split(" ");
		String word1 = vect[0];
		String word2 = vect[1];
		String word3 = vect[2];
		
		System.out.println(word1);
		System.out.println(word2);
		System.out.println(word3);
		
		Math.sqrt(215);
		
		
	}
}
