import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';

class Home extends StatefulWidget {
  const Home({super.key, required this.title});


  final String title;

  @override
  State<Home> createState() => _Home();
}

class _Home extends State<Home> {
  int counter = 0;
  void incrementCounter() {
    setState(() {
      counter++;
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
          backgroundColor: Color(0xff013473),
          title: Center(
            child: const Text(
              "Activities",
              style: TextStyle(
                fontSize: 20,
                color: Colors.white,
              ),
            ),
          ),
          actions: [
            IconButton(
              onPressed: () {},
              icon: Icon(Icons.search),
              color: Colors.white,
            ),
          ]),
      body: ListView(
             children: <Widget>[
               //nav bar
             Container(
                 decoration: BoxDecoration(
                     color: Color(0xfff2f2f2),
                     borderRadius: BorderRadius.all(
                       Radius.circular(120.0),
                     )),
                 margin: EdgeInsets.all(20),
                 height: 70.0,
                 width: double.infinity,
                 child: Row(
                   mainAxisAlignment: MainAxisAlignment.spaceEvenly,
                   crossAxisAlignment: CrossAxisAlignment.center,
                   children: [
                     TextButton(
                       onPressed: () {},
                       child: Text(
                         "All ",
                         style: TextStyle(fontSize: 20.0, color: Colors.black),
                       ),
                     ),
                     TextButton(
                       onPressed: () {},
                       child: Text(
                         "Events ",
                         style: TextStyle(
                           fontSize: 20.0,
                           color: Colors.blue,
                         ),
                       ),
                     ),
                     TextButton(
                       onPressed: () {},
                       child: Text(
                         "Workshops ",
                         style: TextStyle(fontSize: 20.0, color: Colors.black),
                       ),
                     ),
                     TextButton(
                       onPressed: () {},
                       child: Text(
                         "Meets ",
                         style: TextStyle(fontSize: 20.0, color: Colors.black),
                       ),
                     )
                   ],
                 ),
               ),
               //end of nav bar
          Container(
            padding: const EdgeInsets.all(4.0),

            child:Card(
              shape: RoundedRectangleBorder(
                borderRadius: BorderRadius.circular(15.0),
              ),
              child: Padding(
                padding: const EdgeInsets.all(4.0),
                child: Column(
                  mainAxisAlignment: MainAxisAlignment.start,
                  crossAxisAlignment: CrossAxisAlignment.start,
                  children:<Widget> [
                    ClipRRect(
                      borderRadius: BorderRadius.circular(15.0),
                      child: Image.network(
                        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS2XPFn3RHLaiJrFezingIrVBMchg_Fu-um-A&usqp=CAU",
                        fit: BoxFit.cover,
                        width: 300,
                        height: 150,
                      ),
                    ),
                    Text(
                      "PES General Meeting",
                      style: TextStyle(fontSize: 22),
                    ),
                    Text(
                      "4 decembre2022",
                      style: TextStyle(fontSize: 18),
                    )
                  ],
                ),
              ),
            ),
          ),
          Container(
            child:Card(
              shape: RoundedRectangleBorder(
                borderRadius: BorderRadius.circular(15.0),
              ),
              child: Padding(
                padding: const EdgeInsets.all(4.0),
                child: Column(
                  mainAxisAlignment: MainAxisAlignment.start,
                  crossAxisAlignment: CrossAxisAlignment.start,
                  children:<Widget> [
                    ClipRRect(
                      borderRadius: BorderRadius.circular(15.0),
                      child: Image.network(
                        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS2XPFn3RHLaiJrFezingIrVBMchg_Fu-um-A&usqp=CAU",
                        fit: BoxFit.cover,
                        width: 300,
                        height: 150,
                      ),
                    ),


                    /*  Image(
                    image: NetworkImage(
                      "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS2XPFn3RHLaiJrFezingIrVBMchg_Fu-um-A&usqp=CAU",
                    ),
                    width: 300,
                    height: 150,
                    fit: BoxFit.cover,
                  ),*/
                    Text(
                      "PES General Meeting",
                      style: TextStyle(fontSize: 22),
                    ),
                    Text(
                      "4 decembre2022",
                      style: TextStyle(fontSize: 18),
                    )
                  ],
                ),
              ),
            ),
          ),
          Container(
            child:Card(
              shape: RoundedRectangleBorder(
                borderRadius: BorderRadius.circular(15.0),
              ),
              child: Padding(
                padding: const EdgeInsets.all(4.0),
                child: Column(
                  mainAxisAlignment: MainAxisAlignment.start,
                  crossAxisAlignment: CrossAxisAlignment.start,
                  children:<Widget> [
                    ClipRRect(
                      borderRadius: BorderRadius.circular(15.0),
                      child: Image.network(
                        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS2XPFn3RHLaiJrFezingIrVBMchg_Fu-um-A&usqp=CAU",
                        fit: BoxFit.cover,
                        width: 300,
                        height: 150,
                      ),
                    ),


                    /*  Image(
                    image: NetworkImage(
                      "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS2XPFn3RHLaiJrFezingIrVBMchg_Fu-um-A&usqp=CAU",
                    ),
                    width: 300,
                    height: 150,
                    fit: BoxFit.cover,
                  ),*/
                    Text(
                      "PES General Meeting",
                      style: TextStyle(fontSize: 22),
                    ),
                    Text(
                      "4 decembre2022",
                      style: TextStyle(fontSize: 18),
                    )
                  ],
                ),
              ),
            ),
          ),
          Container(
            child:Card(
              shape: RoundedRectangleBorder(
                borderRadius: BorderRadius.circular(15.0),
              ),
              child: Padding(
                padding: const EdgeInsets.all(4.0),
                child: Column(
                  mainAxisAlignment: MainAxisAlignment.start,
                  crossAxisAlignment: CrossAxisAlignment.start,
                  children:<Widget> [
                    ClipRRect(
                      borderRadius: BorderRadius.circular(15.0),
                      child: Image.network(
                        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS2XPFn3RHLaiJrFezingIrVBMchg_Fu-um-A&usqp=CAU",
                        fit: BoxFit.cover,
                        width: 300,
                        height: 150,
                      ),
                    ),


                    /*  Image(
                    image: NetworkImage(
                      "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS2XPFn3RHLaiJrFezingIrVBMchg_Fu-um-A&usqp=CAU",
                    ),
                    width: 300,
                    height: 150,
                    fit: BoxFit.cover,
                  ),*/
                    Text(
                      "PES General Meeting",
                      style: TextStyle(fontSize: 22),
                    ),
                    Text(
                      "4 decembre2022",
                      style: TextStyle(fontSize: 18),
                    )
                  ],
                ),
              ),
            ),
          ),

          Container(
            child:Card(
              shape: RoundedRectangleBorder(
                borderRadius: BorderRadius.circular(15.0),
              ),
              child: Padding(
                padding: const EdgeInsets.all(4.0),
                child: Column(
                  mainAxisAlignment: MainAxisAlignment.start,
                  crossAxisAlignment: CrossAxisAlignment.start,
                  children:<Widget> [
                    ClipRRect(
                      borderRadius: BorderRadius.circular(15.0),
                      child: Image.network(
                        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS2XPFn3RHLaiJrFezingIrVBMchg_Fu-um-A&usqp=CAU",
                        fit: BoxFit.cover,
                        width: 300,
                        height: 150,
                      ),
                    ),


                    /*  Image(
                    image: NetworkImage(
                      "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS2XPFn3RHLaiJrFezingIrVBMchg_Fu-um-A&usqp=CAU",
                    ),
                    width: 300,
                    height: 150,
                    fit: BoxFit.cover,
                  ),*/
                    Text(
                      "PES General Meeting",
                      style: TextStyle(fontSize: 22),
                    ),
                    Text(
                      "4 decembre2022",
                      style: TextStyle(fontSize: 18),
                    )
                  ],
                ),
              ),
            ),
          ),


        ],
      ),




      drawer: Drawer(
        child: Text("xx"),
      ),
    );
  }
}






