package com.musala.javacourse181112.tasks.libraryexercise_v0_1;

import com.musala.javacourse181112.tasks.libraryexercise_v0_1.model.People;
import com.musala.javacourse181112.tasks.libraryexercise_v0_1.model.Rentable;
import com.musala.javacourse181112.tasks.libraryexercise_v0_1.model.RoleEnum;
import com.musala.javacourse181112.tasks.libraryexercise_v0_1.model.items.Book;
import com.musala.javacourse181112.tasks.libraryexercise_v0_1.model.items.Magazine;
import com.musala.javacourse181112.tasks.libraryexercise_v0_1.model.items.Newspaper;

import java.util.ArrayList;
import java.util.List;


public class Application {
    public static void main(final String[] args) {
        List<Rentable> list = new ArrayList<>();
        list.add(new Book());
        list.add(new Magazine());
        list.add(new Newspaper());

        People client1 = new People();
        client1.setRole(RoleEnum.EMPLOEE);
        client1.setRentablesList(list);

    }
}
