import java.time.LocalDate

def ordersList=[:]


for(count in 1 .. 100){
    ordersList.put(count,new Order(new UserAccount(new Random().nextInt(1000000),"Test@123",
            LocalDate.of(1980+new  Random().nextInt(20), 1+new Random().nextInt(10), 1+ new Random().nextInt(26)),
            "","",[new Address(new Random().nextInt(10000),"8d","Chennai","TN",600049)]),
            LocalDate.of(1,1,2023)))
}