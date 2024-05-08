package org.example.code_smells.second.LargeClass.alternative;

import java.util.ArrayList;
import java.util.List;

public class EnemiesList {
        private List<Person> enemies;

        public EnemiesList(){
            enemies = new ArrayList<>();
        }

        public void addFriend(Person person){
            enemies.add(person);
        }

        public void removeFriend(Person person){
            enemies.remove(person);
        }

        public void displayEnemies(){
            System.out.println("Enemies: ");
            for (Person person : enemies){
                System.out.println("    " + person.getName());
            }
        }
    }
