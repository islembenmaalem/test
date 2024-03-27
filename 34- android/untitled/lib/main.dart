import 'package:flutter/material.dart';
import 'package:untitled/View/page1.dart';
import 'View/Home.dart';
import 'View/page1.dart';


void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Flutter Demo',
      theme: ThemeData(
        primarySwatch: Colors.red,
      ),
      debugShowCheckedModeBanner: false,
      home: const page1(title: 'Flutter Demo Home Page'),
    );
  }
}


/*void main() {
  runApp(const Home(title: '',));
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Home',
      debugShowCheckedModeBanner: false,
      theme: ThemeData(

        primarySwatch: Colors.blue,
      ),
      home: const Home(),
    );
  }
}*/

/*class MyHomePage extends StatefulWidget {
  const MyHomePage({Key? key}) : super(key: key);

  @override
  _MyHomePageState createState() => _MyHomePageState();
}

class _MyHomePageState extends State<MyHomePage> {
   // IconData menu = IconData(0xe3dc);

  @override
  Widget build(BuildContext context) {
    return DefaultTabController(
      length: 4,
      child: Scaffold(
          appBar: AppBar(
            backgroundColor: Colors.blue[900],
            leading: Icon(Icons.notes),
            title: Text('Activities'),
            actions:[
              Container(
                child:Icon(Icons.search,color:Colors.white),
                decoration: BoxDecoration(
                  borderRadius: BorderRadius.circular(15),
                  color:         Colors.blue[900],
                ),
               margin: EdgeInsets.only(top:5,bottom: 5),
                padding: EdgeInsets.only(left:10,right: 15 ),
                ),
            ],
          ),
          body: Padding(
            padding: EdgeInsets.all(10),
            child: Column(
              children: [
                Container(
                  height: 45,
                  decoration: BoxDecoration(
                      color: Colors.grey[300],
                      borderRadius: BorderRadius.circular(25)
                  ),
                  child:  TabBar(
                    indicator: BoxDecoration(
                        color: Colors.grey[350],
                        borderRadius:  BorderRadius.circular(25)
                    ) ,
                    labelColor:  Colors.blue[900],
                    unselectedLabelColor: Colors.black,
                    tabs:   [
                    Tab( child: Row(
                                    children:[ Icon(Icons.sort),    //Icon(Icons.notes,),
                                    Text('All'),]
                                    ),
                         ),
                      Tab(text: 'Events',),
                      Tab(text: 'Workshops',),
                      Tab(text: 'Meets',)
                    ],
                  ),
                ),
                const Expanded(
                    child: TabBarView(
                      children:  [
                        Center(child: Text("Page 1 : All"),),
                        Center(child: Text("Page 2 : Events"),),
                        Center(child: Text('Page 3 : Workshops'),),
                        Center(child: Text('Page 4 : Meets'),)
                      ],
                    )
                )
              ],
            ),
          )
      ),
    );
  }
}*/