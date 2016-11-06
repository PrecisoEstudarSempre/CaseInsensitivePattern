import java.util.regex.Pattern;

class CaseInsensitivePattern {
	public static void main(String[] args) {
		//Primeira forma de aplicação através da constante provida pela própria API.
		System.out.println("Case insensitive match via constant: " + Pattern.compile("^([a-z]*\\s*)*$",Pattern.CASE_INSENSITIVE).matcher("PrEcIsO eStUdAr SeMpRe").matches());
		System.out.println("Case sensitive match via constant: " + Pattern.compile("^([a-z]*\\s*)*$").matcher("PrEcIsO eStUdAr SeMpRe").matches());

		//Segunda forma de aplicação através de uma flag na própria regex.
		System.out.println("Case insensitive match via String: " + "PrEcIsO eStUdAr SeMpRe".matches("(?i)^([a-z]*\\s*)*$"));
		System.out.println("Case sensitive match via String: " + "PrEcIsO eStUdAr SeMpRe".matches("^([a-z]*\\s*)*$"));
	}
}