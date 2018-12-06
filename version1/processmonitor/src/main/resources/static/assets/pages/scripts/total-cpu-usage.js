$(document).ready(
    function() {
        alert("total-cpu-usage.js loaded");
        setInterval(function() {
            ajaxSetUpForTotalCpuUsage()
            // var randomnumber = Math.floor(Math.random() * 100);
            //
            // $('#show').text(
            //     'I am getting refreshed every 3 seconds..! Random Number ==> '
            //     + randomnumber);
        }, 3000);
    });

// this executes whenever use selects the type in the drop down box
function ajaxSetUpForTotalCpuUsage() {
    console.log("setting up things for pulling total cpu usage...");

    // display the spinner until the ajax call being requested
    // $('#ajaxLoader').show();

    // do the ajax call
    // if(monitorTypeId.valueOf() === "versions") {
    //     console.log("ajax call to version block");
    //     $.get(url, populateVersionInfo);
    // } else if (monitorTypeId.valueOf() === "cpus") {
    //     console.log("ajax call to cpus block");
    //     $.get(url, populateCpuInfo);
    // } else {
    //     console.log("else block in ajax call");
    // }

    var url = "http://localhost:8080/api/ajax/cpus";
    console.log("Endpoint requested: ", url);

    $.get(url, populateTotalCpuInfo);
    console.log("call made...");
}

// This function executes when version type is being selected
function populateTotalCpuInfo(data) {
    console.log("populateTotalCpuInfo data: ", data,
        "\npopulateTotalCpuInfo response: ", data.response);

    // var status = data.responseStatus;
    //
    // //check the response to make sure it's ok
    // if (status == "Ok") {
    //     var response = data.response;
    //
    //     // parse received JSON data
    //     // var cpuInfoModelImage = './images/' + response.imageFile;
    //     // var cpuInfoModelImage = '/images/cpulogo.jpg';
    //     // console.log("cpuImage: " + cpuInfoModelImage);
    //
    //     var cpuInfoModelId = response.id;
    //     var cpuInfoModelVendor = response.cpuVendor;
    //     var cpuInfoModelName = response.cpuModel;
    //     var cpuInfoModelTotalCores = response.cpuTotalCores;
    //
    //     var cpuInfoModelTotalIdleTime = response.totalIdleTime;
    //     var cpuInfoModelTotalWaitTime = response.totalWaitTime;
    //     var cpuInfoModelTotalUserTime = response.totalUserTime;
    //     var cpuInfoModelTotalCombinedTime = response.totalCombinedTime;
    //     var cpuInfoModelTotalIrqTime = response.totalIrqTime;
    //     var cpuInfoModelTotalNiceTime = response.totalNiceTime;
    //     var cpuInfoModelTotalSysTime = response.totalSysTime;
    //
    //     // set the version model badge values
    //     // $('#cpuInfoModelPic').attr("src", cpuInfoModelImage);
    //     $('#cpuInfoModelHeaderName').html(cpuInfoModelName);
    //
    //     // set the input field values
    //     $('#cpuInfoModelId').val(cpuInfoModelId);
    //     $('#cpuInfoModelVendor').val(cpuInfoModelVendor);
    //     $('#cpuInfoModelName').val(cpuInfoModelName);
    //     $('#cpuInfoModelTotalCores').val(cpuInfoModelTotalCores);
    //
    //     $('#cpuInfoModelTotalIdleTime').val(cpuInfoModelTotalIdleTime);
    //     $('#cpuInfoModelTotalWaitTime').val(cpuInfoModelTotalWaitTime);
    //     $('#cpuInfoModelTotalUserTime').val(cpuInfoModelTotalUserTime);
    //     $('#cpuInfoModelTotalCombinedTime').val(cpuInfoModelTotalCombinedTime);
    //     $('#cpuInfoModelTotalIrqTime').val(cpuInfoModelTotalIrqTime);
    //     $('#cpuInfoModelTotalNiceTime').val(cpuInfoModelTotalNiceTime);
    //     $('#cpuInfoModelTotalSysTime').val(cpuInfoModelTotalSysTime);
    //
    //     // hide other ones
    //     $('#profileRow').css('visibility','none');
    //
    //     // show the hidden version related elements
    //     $('#cpuProfileRow').css('visibility','visible');
    //
    // }
    //
    // // hide the ajax loader spinner
    // $('#ajaxLoader').hide();
}

