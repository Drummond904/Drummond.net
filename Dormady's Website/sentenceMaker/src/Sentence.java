import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sentence {

	public static void main(String[] args) {
		String[] article = {"the","a","one","some","any"};
		String[] noun = {"boy","girl","dog","town","car"};
		String[] verb = {"drove","jumped","ran","walked","skipped"};
		String[] preposition = {"to","from","over","under","on"};
		System.out.println(article);
		
		List<String> articles = Arrays.asList(article);
		List<String> nouns = Arrays.asList(noun);
		List<String> verbs = Arrays.asList(verb);
		List<String> prepositions = Arrays.asList(preposition);
		Collections.shuffle(articles);
		Collections.shuffle(nouns);
		Collections.shuffle(verbs);
		Collections.shuffle(prepositions);
		
		for (String theArticles : articles)
		{
			System.out.println(theArticles + " " + nouns + " " + verbs + " " + prepositions + " " + theArticles + " " + nouns + " .");
			for (String theNouns : nouns)
			{
				System.out.println(theArticles + " " + theNouns + " " + verbs + " " + prepositions + " " + theArticles + " " + theNouns + " .");
				for (String theVerbs : verbs)
				{
					System.out.println(theArticles + " " + theNouns + " " + theVerbs + " " + prepositions + " " + theArticles + " " + theNouns + " .");
					for (String thePrepositions : prepositions)
					{
						System.out.println(theArticles + " " + theNouns + " " + theVerbs + " " + thePrepositions + " " + theArticles + " " + theNouns + " .");
					}
				}
			}
			System.out.println();
		}
	}
}
