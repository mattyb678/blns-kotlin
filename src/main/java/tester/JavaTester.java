package tester;

import xyz.mattyb.blns.NaughtyStrings;

public class JavaTester {
    public static void main(String[] args) {
        System.out.println(NaughtyStrings.Emoji.all());
        System.out.println(NaughtyStrings.Emoji.drop(15));
        System.out.println(NaughtyStrings.Emoji.take(3));
        System.out.println(NaughtyStrings.Emoji.random());
        System.out.println(NaughtyStrings.Emoji.Animals.Monkeys.all());
        System.out.println(NaughtyStrings.Emoji.Hearts.all());
        System.out.println(NaughtyStrings.Emoji.Smileys.all());
        System.out.println(NaughtyStrings.Emoji.People.all());
        System.out.println(NaughtyStrings.Emoji.Digits.all());
        System.out.println(NaughtyStrings.Emoji.Signs.all());
        System.out.println(NaughtyStrings.Emoticons.random());
    }
}
