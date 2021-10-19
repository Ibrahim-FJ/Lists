

fun main(){

    val computerList = mutableListOf("Dell", "Apple", "Acer")


//-----------------------------------------------------------------------//
        // All methods to access and update an element in List //


    computerList.first()       // return the first element
    computerList.last()        // return the last element
    computerList.getOrNull(5)          // return the specified element or null if not exist
    computerList.getOrElse(5) { "The element not exist" }      // return the specified element or do else if not exist
    computerList.contains("Dell")      // return Boolean
    computerList.containsAll(listOf("Dell","Acer")) // return Boolean


//--------------------------------------------------------------------------//
            // Changing element value //
    computerList[0] = "Asus"
    computerList.add("Msi")     // add new element after the last element in the list
    computerList.add(2, "Dell")     // add "Dell" at 2 index
    computerList.addAll(listOf("Huawei", "hp"))     // add list of elements
    computerList += listOf("computer_1", "computer_2")      // add to the list


//----------------------------------------------------------------------------//
            // Remove element or multiple elements //
    computerList -= "computer_2"      // remove element from the list
    computerList.removeAt(1)        // remove at index 1
    computerList.remove("computer_1")       //remove the specified element
    computerList.removeFirst()                     // remove the first element -> Boolean
    computerList.removeLast()                       // remove the last element -> Boolean
    computerList.removeFirstOrNull()
    computerList.removeLastOrNull()
    computerList.removeAll(listOf("Dell", "Acer"))      //remove list of elements
    computerList.removeIf { it.contains("O") }
    computerList.clear()            // remove the entire list


//-------------------------------------------------------------------------------------//
                                 // Iteration //
    for(item in computerList){              // for loop of each element
        println(item)
    }

    for (item in 0..2){                 // for loop of each element within 0..2
        println(item)
    }

    computerList.forEach { it -> println(it) }     // forEach to retrieve each element
    computerList.forEachIndexed { index, item -> println("$index - $item")}  // forEach to retrieve each index and its element
    

//-------------------------------------------------------------------------------------//
                // update single element or multiple elements //

    computerList.forEachIndexed {index, item ->
        if (item == "msi"){
            computerList[index] = "Acer"
        }
    }


}