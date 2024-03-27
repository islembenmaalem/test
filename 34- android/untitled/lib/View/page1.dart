import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';

class page1 extends StatefulWidget {
  const page1({super.key, required this.title});


  final String title;

  @override
  State<page1> createState() => _page1();
}

class _page1 extends State<page1> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: Color(0xff013473),
       body:
        Column(
          mainAxisAlignment: MainAxisAlignment.spaceEvenly,
          crossAxisAlignment: CrossAxisAlignment.center,
          children: [
            SizedBox(height: 15.0,),
            SizedBox(height: 40.0,),
            Row(
                mainAxisAlignment: MainAxisAlignment.spaceEvenly,
                children:[Container(
                alignment: Alignment.center,
                child:
                  Image.network(
                  "data:image/png;base64,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",
                  fit: BoxFit.cover,
                  width: 350,
                  height: 180,
                ),
              )]
            ),
            SizedBox(height: 80.0,),
            Row(
              mainAxisAlignment: MainAxisAlignment.spaceEvenly,
              children: [
                Text(
                  "#Teams_build_dreams",
                  style: TextStyle(fontSize: 22,
                      color: Colors.white
                  ),

                ),
              ],
            )


          ],
        ),


      
      


            );





}
}

/*Container(
alignment: Alignment.center,
child:  Image.network(
"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS2XPFn3RHLaiJrFezingIrVBMchg_Fu-um-A&usqp=CAU",
fit: BoxFit.cover,
width: 300,
height: 150,
),



),*/