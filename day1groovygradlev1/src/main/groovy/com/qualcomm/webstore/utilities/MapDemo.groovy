import java.time.LocalDate
import com.qualcomm.webstore.models.Address
import com.qualcomm.webstore.models.UserAccount
import com.qualcomm.webstore.models.Order

def ordersMap=[:]


for(count in 1 .. 100){
    ordersMap.put(count,new Order(new UserAccount(new Random().nextInt(1000000),"Test@123",
            LocalDate.of(1980+new  Random().nextInt(20), 1+new Random().nextInt(10), 1+ new Random().nextInt(26)),
            "","",[new Address(new Random().nextInt(10000),"8d","Chennai","TN",600049)]),
            LocalDate.of(2023,1,22)))
}

ordersMap.each {println(it.key)
println(it.value)}