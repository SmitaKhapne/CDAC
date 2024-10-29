
            function forEachElement(arr,callback)
            {
                for(i=0;i<arr.length;i++)
                {
                    callback(arr[i]);
                }
            }

            const arr = [10,20,30,40,50];

            forEachElement(arr,function(value,index){
                let result = value * 2;
                console.log(result);
            });