package com.craftjourney;

import java.util.LinkedHashSet;
import java.util.Set;

import com.craftjourney.exceptions.IllegalBlocException;

public class Kit {

    private Set<IBloc> blocs = new LinkedHashSet<IBloc>();
    private Set<String> keywords = new LinkedHashSet<String>();

    public Kit() throws IllegalBlocException {
        // Initialize the kit with some default blocs
        blocs.add(new Wall(3, 2, 2, true));
        blocs.add(new Wall(3, 2, 2, true));
        blocs.add(new Wall(2, 1, 2, false));
        blocs.add(new Wall(2, 1, 2, false));
        blocs.add(new Door(1, 1, 2, true));

        keywords.add("Cabane");
        keywords.add("Muraille");
    }

    public void displayKit() {
        System.out.println("Kit bloc's number: " + blocs.size());
        System.out.println("Kit's keywords': ");
        for (String keyword : keywords) {
            System.out.println(keyword);
        }
    }
}