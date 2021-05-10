package Jump;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class User {
        String name;
        LocalDate birthday;
        boolean isMale;

    public User(String name, LocalDate birthday) {
            this.name = name;
            this.birthday = birthday;
        }

        public static void main (String[]args){
            User user = new User("Bob", LocalDate.of(1985, 6, 7));
            User user2 = new User("Tom", LocalDate.of(2000, 2, 15));
            User user3 = new User("Sam", LocalDate.of(1998, 6, 9));
            System.out.println(user.getOldestUser(user, user2, user3));
            System.out.println(user.getYoungestUser(user, user2, user3));
        }

        @Override
        public String toString () {
            return "User{" +
                    "name='" + name + '\'' +
                    ", birthday=" + birthday +
                    ", isMale=" + isMale +
                    '}';
        }
        public List<User> getYoungestUser (User ...users){
            User currentMin = null;
            List<User> min = new ArrayList<>();
            if (users.length > 0) {
                currentMin = users[0];
                for (User temp : users) {
                    if (temp.birthday.isAfter(currentMin.birthday)) {
                        currentMin = temp;
                    }
                }
            }
            if (currentMin != null) {
                min.add(currentMin);
            }
            return min;
        }
        public List<User> getOldestUser (User ...users){
            User currentMax = null;
            List<User> max = new ArrayList<>();
            if (users.length > 0) {
                currentMax = users[0];
                for (User temp : users) {
                    if (temp.birthday.isBefore(currentMax.birthday)) {
                        currentMax = temp;
                    }
                }
            }
            if (currentMax != null) {
                max.add(currentMax);
            }
            return max;

        }
}


//        long days = 0;
//
//        LocalDate birthday = LocalDate.of(1998, 5, 1);
//        LocalDate dateNow = LocalDate.now();
//        LocalDate currentBirthday = LocalDate.of(dateNow.getYear(), birthday.getMonth(), birthday.getDayOfMonth());
//        if (dateNow.isAfter(currentBirthday)) {
//            LocalDate futureBirthday = LocalDate.of(dateNow.getYear() + 1, birthday.getMonth(), birthday.getDayOfMonth());
//            days = dateNow.until(futureBirthday, ChronoUnit.DAYS);
//        } else {
//            days = dateNow.until(currentBirthday, ChronoUnit.DAYS);
//        }
//        System.out.println(days);
//    }
//}



//        Map<String, LocalDate> map = new HashMap<>();
//        map.put("Ivanov", LocalDate.now());
//        map.put("Petrov", LocalDate.now());
//        map.put("Smernov", LocalDate.now());
//        map.put("Larin", LocalDate.of(1998, Month.DECEMBER, 20));
//        map.put("Ivanov", LocalDate.of(2000, Month.APRIL,24 ));
//        Data col = new Data();
//        col.filterDate(map, 18);
//
//    }
//    public void filterDate(Map<String, LocalDate> localMap, int minAge) {
//        Map<String, LocalDate> copy = new HashMap<>(localMap);
//        LocalDate currentDate = LocalDate.now();
//        int currentYear = currentDate.getYear();
//        Set<String> dates = copy.keySet();
//        List<String> spisok=new ArrayList<>();
//        for (String key : dates) {
//            LocalDate value = copy.get(key);
//            int bornDate = value.getYear();
//            if (currentYear - bornDate < minAge) {
//                spisok.add(key);
//            }
//        }
//        for (String temp : spisok) {
//            copy.remove(temp);
//
//        }
//        System.out.println(copy);
//    }
//}

