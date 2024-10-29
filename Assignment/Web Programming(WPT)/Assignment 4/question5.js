
function processData(data, callback) {
    document.writeln("Processing data...");
    setTimeout(() => {
        const processedData = data.toUpperCase(); 
        callback(processedData);
    }, 1000);
}

fetchData("https://example.com", (error, response) => {
    if (error) {
        console.error(error);
    } else {
        processData(response, (processedData) => {
            document.writeln("Processed Data:", processedData);
        });
    }
});