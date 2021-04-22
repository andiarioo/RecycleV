package com.example.recyclev;

import java.util.ArrayList;


public class HeroDatabase {
    private static String[] heroNames = {
            "Avengers : Endgame",
            "Titanic",
            "Hereditary",
            "Jumanji: Welcome to the Jungle",
            "A Star is Born",
            "Furious 7",
            "Coco",
            "Bohemian Rhapsody",
            "Ada Apa Dengan Cinta",
            "Dilan 1990"
    };

    private static String[] heroDetails = {
            "After Thanos, an intergalactic warlord, disintegrates half of the universe, the Avengers must reunite and assemble again to reinvigorate their trounced allies and restore balance.",
            "Seventeen-year-old Rose hails from an aristocratic family and is set to be married. When she boards the Titanic, she meets Jack Dawson, an artist, and falls in love with him.",
            "When the matriarch of the Graham family passes away, her daughter and grandchildren begin to unravel cryptic and increasingly terrifying secrets about their ancestry, trying to outrun the sinister fate they have inherited.",
            "When four students play with a magical video game, they are drawn to the jungle world of Jumanji, where they are trapped as their avatars. To return to the real world, they must finish the game.",
            "After falling in love with struggling artist Ally, Jackson, a musician, coaxes her to follow her dreams, while he battles with alcoholism and his personal demons.",
            "Dominic and his family are caught in a quagmire when Shaw's brother seeks bloody revenge. They must not only deal with their enemy but also save a crucial programme from falling into the wrong hands.",
            "Despite his family's generations-old ban on music, young Miguel dreams of becoming an accomplished musician like his idol Ernesto de la Cruz. Desperate to prove his talent, Miguel finds himself in the stunning and colorful Land of the Dead. After meeting a charming trickster named Héctor, the two new friends embark on an extraordinary journey to unlock the real story behind Miguel's family history.",
            "With his impeccable vocal abilities, Freddie Mercury and his rock band, Queen, achieve superstardom. However, amidst his skyrocketing success, he grapples with his ego, sexuality and a fatal illness.",
            "A popular high school girl has to choose whether she wants to remain a part of her gang or fall in love with a boy who loves literature at school.",
            "Milea met with Dilan at a high school in Bandung in 1990, when Milea moved from Jakarta to Bandung. An unusual introduction brings Milea to know the uniqueness of Dilan, smart, kind, romantic. The way Dilan approaches Milea is not the same as other male friends, even Beni , Milea's boyfriend in Jakarta. The journey of their relationship is not always smooth. Beni, Anhar , Kang Adi color the journey. Dilan makes Milea believe that she can arrive at the destination safely."
    };

    private static int[] heroesImages = {
            R.drawable.endgame,
            R.drawable.titanic,
            R.drawable.hereditary,
            R.drawable.jumanji,
            R.drawable.starborn,
            R.drawable.ff7,
            R.drawable.coco,
            R.drawable.bohemian,
            R.drawable.aadc,
            R.drawable.dilan
    };

    static ArrayList<HeroModel> getListData() {
        ArrayList<HeroModel> list = new ArrayList<>();
        for (int position = 0; position < heroNames.length; position++) {
            HeroModel hero = new HeroModel();
            hero.setName(heroNames[position]);
            hero.setSummary(heroDetails[position]);
            hero.setPhoto(heroesImages[position]);
            list.add(hero);
        }
        return list;
    }
}
