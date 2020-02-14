import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.temporal.ChronoUnit

fun main(){
    val formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy")
    val today = LocalDate.now()
    val formatToday = today.format(formatter)
    var mostRecent: LocalDate = LocalDate.of(2020,2,9)
    val fullMoon = mostRecent.format(formatter)


    while (today.isAfter(mostRecent)){
        mostRecent = mostRecent.plusDays(29)
    }


    println("Today's date: $formatToday")


    val daysTill = today.until(mostRecent, ChronoUnit.DAYS)

    if (daysTill.toInt() == 0){
        println("There will be a full moon tonight.")
    } else {
        println("The next full moon is in $daysTill days on $fullMoon.")
    }


}