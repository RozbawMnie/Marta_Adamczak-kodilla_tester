public class SecondClass {
        public static void main(String[] args) {
            int sum = 0;
            User marta = new User("Marta", 26);
            User beth = new User("Beth", 33);
            User anna = new User("Anna", 25);
            User tim = new User("Tim", 13);
            User henry = new User("Henry", 38);
            User tina = new User("Tina", 32);
            User[] users = {marta, beth, anna, tim, henry, tina};

            for (int i = 0; i <= users.length; i++) {
                sum += users[i].age;
            }
            double avg = sum/users.length;

            for (int i = 0; i <= users.length; i++) {
                if (users[i].age < avg){
                    System.out.println(users[i]);
                }
            }
        }

    }
