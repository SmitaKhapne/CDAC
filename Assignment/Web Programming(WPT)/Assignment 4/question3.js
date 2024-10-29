
function fetchData(url,callback)
{
    console.log("fetching data from ${url}...");

    setTimeout(() => {
        const response = "data received from" + url;
        callback(response);
    },2000);

    fetchData("https://example.com",(response) =>{
                        console.log(response);
    });
}