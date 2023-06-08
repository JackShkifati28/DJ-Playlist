# DJ-Playlist

## Description
The purpose of this project is to create a playlist for a DJ using a data structure - binary search tree. The playlist contains the song name, artist, average number of plays for each song, and the average number of plays for each artist.

## Instruction
The way we obtain this information is as follows:

First, we create a class called `BinarySearchTree` that has an inner class called `Song`. The `Song` class represents a node that stores the data in the binary search tree. It also calculates the average number of plays for each song and the average number of plays for each artist. To get the proper averages, we need to consider different scenarios. For instance, to get the average of the song title of every song that’s being added to the binary search tree, if it has the same song title, we sum up the total number of plays and divide it by the number of times it's repeated. If the song title is not repeated, then the average number of plays is equal to the number of plays for that song. The same process applies for the average number of artists. Therefore, when returning the data we consider the different scenarios. The `BinarySearchTree` class also includes the following methods: `insert`, `subset`, and `PreOrder`.

Second, we create a `DjPlaylist` class that retrieves the data from multiple csv files and instantiates an object of the `BinarySearchTree` class and adds the data into it. The `DjPlaylist` class has the methods: `readFile`, `storeData`, `SongList`, and `print`. The `readFile` method reads all the csv files and stores the data into an ArrayList called `storeData`. Then we use the `storeData` method to split the different data into three different ArrayLists: `Songlist`, `ArtistName`, and `Streams`. Once we have separate data, we can now insert it into the binary search tree using the `SongList` method. After we are done, we can print the data into two separate text files using the `print` method. One of the text files is for the full list containing all the information of the playlist called `DjPlayList.txt`. The second text file `SubSet.txt` is for the range of data given the domain of the song titles.

