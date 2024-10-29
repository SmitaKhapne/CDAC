
            // function toUpperCaseDemo(original)
            // {
            //    let t2 = original.toUpperCase();
            //     console.log(t2);
            // }
            // const original = "hello";
            // const upperString = toUpperCaseDemo(original);
            // console.log(upperString);

            
            function toUpperCase(str,callback)
            {
                return callback(str);
            }

            function convertUpperCase(str)
            {
                return str.toUpperCase();
            }
            console.log(myUpper("hello world",convertUpperCase));