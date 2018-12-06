var globalRequestSendInterval = 5000;

$(document).ready(
    function() {
        let cpuTotalUsageDBIdIndex = 2;
        console.log("1st cpu total usage DB index value initialized...");
        setInterval(function() {
            ajaxSetUpForTotalCpuUsage(cpuTotalUsageDBIdIndex)
            cpuTotalUsageDBIdIndex += 2;
        }, globalRequestSendInterval);
    });

// this executes whenever use selects the type in the drop down box
function ajaxSetUpForTotalCpuUsage(cpuTotalUsageDBIdIndexArg) {
    console.log("setting up things for pulling total cpu usage...");

    // display the spinner until the ajax call being requested
    // $('#ajaxLoader').show();

    let url = "http://localhost:8080/api/ajax/cpus/" + cpuTotalUsageDBIdIndexArg;
    console.log("Endpoint requested: ", url);

    $.get(url, populateTotalCpuInfo);
    console.log("call made...");
}

// This function executes when version type is being selected
function populateTotalCpuInfo(data) {
    console.log("populateTotalCpuInfo data: ", data,
        "\npopulateTotalCpuInfo response: ", data.response);

    let status = data.responseStatus;

    //check the response to make sure it's ok
    if (status == "Ok") {
        let response = data.response;

        // parse received JSON data
        // let cpuInfoModelImage = './images/' + response.imageFile;
        // let cpuInfoModelImage = '/images/cpulogo.jpg';
        // console.log("cpuImage: " + cpuInfoModelImage);

        let cpuInfoModelId = response.id;
        let cpuInfoModelVendor = response.cpuVendor;
        let cpuInfoModelName = response.cpuModel;
        let cpuInfoModelTotalCores = response.cpuTotalCores;
        let cpuInfoModelOperatingAt = response.cpuOperatingAt;

        let cpuInfoModelTotalIdleTime = response.totalIdleTime;
        let cpuInfoModelTotalWaitTime = response.totalWaitTime;
        let cpuInfoModelTotalUserTime = response.totalUserTime;
        let cpuInfoModelTotalCombinedTime = response.totalCombinedTime;
        let cpuInfoModelTotalIrqTime = response.totalIrqTime;
        let cpuInfoModelTotalNiceTime = response.totalNiceTime;
        let cpuInfoModelTotalSysTime = response.totalSysTime;

        // set the version model badge values
        // $('#cpuInfoModelPic').attr("src", cpuInfoModelImage);
        $('#cpuInfoModelHeaderName1').html(cpuInfoModelName);

        // set the input field values
        $('#cpuInfoModelId1').val(cpuInfoModelId);
        $('#cpuInfoModelVendor1').val(cpuInfoModelVendor);
        $('#cpuInfoModelName1').val(cpuInfoModelName);
        $('#cpuInfoModelTotalCores1').val(cpuInfoModelTotalCores);
        $('#cpuInfoModelOperatingAt1').val(cpuInfoModelOperatingAt);

        $('#cpuInfoModelTotalIdleTime1').val(cpuInfoModelTotalIdleTime);
        $('#cpuInfoModelTotalWaitTime1').val(cpuInfoModelTotalWaitTime);
        $('#cpuInfoModelTotalUserTime1').val(cpuInfoModelTotalUserTime);
        $('#cpuInfoModelTotalCombinedTime1').val(cpuInfoModelTotalCombinedTime);
        $('#cpuInfoModelTotalIrqTime1').val(cpuInfoModelTotalIrqTime);
        $('#cpuInfoModelTotalNiceTime1').val(cpuInfoModelTotalNiceTime);
        $('#cpuInfoModelTotalSysTime1').val(cpuInfoModelTotalSysTime);

        // hide other ones
        // $('#profileRow').css('visibility','none');

        // show the hidden version related elements
        // $('#cpuProfileRow').css('visibility','visible');

    }

    // hide the ajax loader spinner
    // $('#ajaxLoader').hide();
}

// for 2nd row that updates in real time - there is a better way to do; but for now, lets proceed with this approach
$(document).ready(
    function() {
        let cpuTotalUsageDBIdIndex = 3;
        console.log("2nd cpu total usage DB index value initialized...");
        setInterval(function() {
            ajaxSetUpForTotalCpuUsage2(cpuTotalUsageDBIdIndex)
            cpuTotalUsageDBIdIndex += 2;
        }, globalRequestSendInterval);
    });

// this executes whenever use selects the type in the drop down box
function ajaxSetUpForTotalCpuUsage2(cpuTotalUsageDBIdIndexArg) {
    console.log("setting up things for pulling total cpu usage...");

    // display the spinner until the ajax call being requested
    // $('#ajaxLoader').show();

    let url = "http://localhost:8080/api/ajax/cpus/" + cpuTotalUsageDBIdIndexArg;
    console.log("Endpoint requested: ", url);

    $.get(url, populateTotalCpuInfo2);
    console.log("call made...");
}

// This function executes when version type is being selected
function populateTotalCpuInfo2(data) {
    console.log("populateTotalCpuInfo2 data: ", data,
        "\npopulateTotalCpuInfo response: ", data.response);

    let status = data.responseStatus;

    //check the response to make sure it's ok
    if (status == "Ok") {
        let response = data.response;

        // parse received JSON data
        // let cpuInfoModelImage = './images/' + response.imageFile;
        // let cpuInfoModelImage = '/images/cpulogo.jpg';
        // console.log("cpuImage: " + cpuInfoModelImage);

        let cpuInfoModelId = response.id;
        let cpuInfoModelVendor = response.cpuVendor;
        let cpuInfoModelName = response.cpuModel;
        let cpuInfoModelTotalCores = response.cpuTotalCores;
        let cpuInfoModelOperatingAt = response.cpuOperatingAt;

        let cpuInfoModelTotalIdleTime = response.totalIdleTime;
        let cpuInfoModelTotalWaitTime = response.totalWaitTime;
        let cpuInfoModelTotalUserTime = response.totalUserTime;
        let cpuInfoModelTotalCombinedTime = response.totalCombinedTime;
        let cpuInfoModelTotalIrqTime = response.totalIrqTime;
        let cpuInfoModelTotalNiceTime = response.totalNiceTime;
        let cpuInfoModelTotalSysTime = response.totalSysTime;

        // set the version model badge values
        // $('#cpuInfoModelPic').attr("src", cpuInfoModelImage);
        $('#cpuInfoModelHeaderName2').html(cpuInfoModelName);

        // set the input field values
        $('#cpuInfoModelId2').val(cpuInfoModelId);
        $('#cpuInfoModelVendor2').val(cpuInfoModelVendor);
        $('#cpuInfoModelName2').val(cpuInfoModelName);
        $('#cpuInfoModelTotalCores2').val(cpuInfoModelTotalCores);
        $('#cpuInfoModelOperatingAt2').val(cpuInfoModelOperatingAt);

        $('#cpuInfoModelTotalIdleTime2').val(cpuInfoModelTotalIdleTime);
        $('#cpuInfoModelTotalWaitTime2').val(cpuInfoModelTotalWaitTime);
        $('#cpuInfoModelTotalUserTime2').val(cpuInfoModelTotalUserTime);
        $('#cpuInfoModelTotalCombinedTime2').val(cpuInfoModelTotalCombinedTime);
        $('#cpuInfoModelTotalIrqTime2').val(cpuInfoModelTotalIrqTime);
        $('#cpuInfoModelTotalNiceTime2').val(cpuInfoModelTotalNiceTime);
        $('#cpuInfoModelTotalSysTime2').val(cpuInfoModelTotalSysTime);

        // hide other ones
        // $('#profileRow').css('visibility','none');

        // show the hidden version related elements
        // $('#cpuProfileRow').css('visibility','visible');

    }

    // hide the ajax loader spinner
    // $('#ajaxLoader').hide();
}

// for 3 row that updates in real time - there is a better way to do; but for now, lets proceed with this approach
$(document).ready(
    function() {
        let cpuTotalUsageDBIdIndex = 4;
        console.log("3rd cpu total usage DB index value initialized...");
        setInterval(function() {
            ajaxSetUpForTotalCpuUsage3(cpuTotalUsageDBIdIndex)
            cpuTotalUsageDBIdIndex += 2;
        }, globalRequestSendInterval);
    });

// this executes whenever use selects the type in the drop down box
function ajaxSetUpForTotalCpuUsage3(cpuTotalUsageDBIdIndexArg) {
    console.log("setting up things for pulling total cpu usage...");

    // display the spinner until the ajax call being requested
    // $('#ajaxLoader').show();

    let url = "http://localhost:8080/api/ajax/cpus/" + cpuTotalUsageDBIdIndexArg;
    console.log("Endpoint requested: ", url);

    $.get(url, populateTotalCpuInfo3);
    console.log("call made...");
}

// This function executes when version type is being selected
function populateTotalCpuInfo3(data) {
    console.log("populateTotalCpuInfo2 data: ", data,
        "\npopulateTotalCpuInfo response: ", data.response);

    let status = data.responseStatus;

    //check the response to make sure it's ok
    if (status == "Ok") {
        let response = data.response;

        // parse received JSON data
        // let cpuInfoModelImage = './images/' + response.imageFile;
        // let cpuInfoModelImage = '/images/cpulogo.jpg';
        // console.log("cpuImage: " + cpuInfoModelImage);

        let cpuInfoModelId = response.id;
        let cpuInfoModelVendor = response.cpuVendor;
        let cpuInfoModelName = response.cpuModel;
        let cpuInfoModelTotalCores = response.cpuTotalCores;
        let cpuInfoModelOperatingAt = response.cpuOperatingAt;

        let cpuInfoModelTotalIdleTime = response.totalIdleTime;
        let cpuInfoModelTotalWaitTime = response.totalWaitTime;
        let cpuInfoModelTotalUserTime = response.totalUserTime;
        let cpuInfoModelTotalCombinedTime = response.totalCombinedTime;
        let cpuInfoModelTotalIrqTime = response.totalIrqTime;
        let cpuInfoModelTotalNiceTime = response.totalNiceTime;
        let cpuInfoModelTotalSysTime = response.totalSysTime;

        // set the version model badge values
        // $('#cpuInfoModelPic').attr("src", cpuInfoModelImage);
        $('#cpuInfoModelHeaderName3').html(cpuInfoModelName);

        // set the input field values
        $('#cpuInfoModelId3').val(cpuInfoModelId);
        $('#cpuInfoModelVendor3').val(cpuInfoModelVendor);
        $('#cpuInfoModelName3').val(cpuInfoModelName);
        $('#cpuInfoModelTotalCores3').val(cpuInfoModelTotalCores);
        $('#cpuInfoModelOperatingAt3').val(cpuInfoModelOperatingAt);

        $('#cpuInfoModelTotalIdleTime3').val(cpuInfoModelTotalIdleTime);
        $('#cpuInfoModelTotalWaitTime3').val(cpuInfoModelTotalWaitTime);
        $('#cpuInfoModelTotalUserTime3').val(cpuInfoModelTotalUserTime);
        $('#cpuInfoModelTotalCombinedTime3').val(cpuInfoModelTotalCombinedTime);
        $('#cpuInfoModelTotalIrqTime3').val(cpuInfoModelTotalIrqTime);
        $('#cpuInfoModelTotalNiceTime3').val(cpuInfoModelTotalNiceTime);
        $('#cpuInfoModelTotalSysTime3').val(cpuInfoModelTotalSysTime);

        // hide other ones
        // $('#profileRow').css('visibility','none');

        // show the hidden version related elements
        // $('#cpuProfileRow').css('visibility','visible');

    }

    // hide the ajax loader spinner
    // $('#ajaxLoader').hide();
}

// for 4 row that updates in real time - there is a better way to do; but for now, lets proceed with this approach
$(document).ready(
    function() {
        let cpuTotalUsageDBIdIndex = 5;
        console.log("4th cpu total usage DB index value initialized...");
        setInterval(function() {
            ajaxSetUpForTotalCpuUsage4(cpuTotalUsageDBIdIndex)
            cpuTotalUsageDBIdIndex += 2;
        }, globalRequestSendInterval);
    });

// this executes whenever use selects the type in the drop down box
function ajaxSetUpForTotalCpuUsage4(cpuTotalUsageDBIdIndexArg) {
    console.log("setting up things for pulling total cpu usage...");

    // display the spinner until the ajax call being requested
    // $('#ajaxLoader').show();

    let url = "http://localhost:8080/api/ajax/cpus/" + cpuTotalUsageDBIdIndexArg;
    console.log("Endpoint requested: ", url);

    $.get(url, populateTotalCpuInfo4);
}

// This function executes when version type is being selected
function populateTotalCpuInfo4(data) {
    console.log("populateTotalCpuInfo4 data: ", data,
        "\npopulateTotalCpuInfo response: ", data.response);

    let status = data.responseStatus;

    //check the response to make sure it's ok
    if (status == "Ok") {
        let response = data.response;

        // parse received JSON data
        // let cpuInfoModelImage = './images/' + response.imageFile;
        // let cpuInfoModelImage = '/images/cpulogo.jpg';
        // console.log("cpuImage: " + cpuInfoModelImage);

        let cpuInfoModelId = response.id;
        let cpuInfoModelVendor = response.cpuVendor;
        let cpuInfoModelName = response.cpuModel;
        let cpuInfoModelTotalCores = response.cpuTotalCores;
        let cpuInfoModelOperatingAt = response.cpuOperatingAt;

        let cpuInfoModelTotalIdleTime = response.totalIdleTime;
        let cpuInfoModelTotalWaitTime = response.totalWaitTime;
        let cpuInfoModelTotalUserTime = response.totalUserTime;
        let cpuInfoModelTotalCombinedTime = response.totalCombinedTime;
        let cpuInfoModelTotalIrqTime = response.totalIrqTime;
        let cpuInfoModelTotalNiceTime = response.totalNiceTime;
        let cpuInfoModelTotalSysTime = response.totalSysTime;

        // set the version model badge values
        // $('#cpuInfoModelPic').attr("src", cpuInfoModelImage);
        $('#cpuInfoModelHeaderName4').html(cpuInfoModelName);

        // set the input field values
        $('#cpuInfoModelId4').val(cpuInfoModelId);
        $('#cpuInfoModelVendor4').val(cpuInfoModelVendor);
        $('#cpuInfoModelName4').val(cpuInfoModelName);
        $('#cpuInfoModelTotalCores4').val(cpuInfoModelTotalCores);
        $('#cpuInfoModelOperatingAt4').val(cpuInfoModelOperatingAt);

        $('#cpuInfoModelTotalIdleTime4').val(cpuInfoModelTotalIdleTime);
        $('#cpuInfoModelTotalWaitTime4').val(cpuInfoModelTotalWaitTime);
        $('#cpuInfoModelTotalUserTime4').val(cpuInfoModelTotalUserTime);
        $('#cpuInfoModelTotalCombinedTime4').val(cpuInfoModelTotalCombinedTime);
        $('#cpuInfoModelTotalIrqTime4').val(cpuInfoModelTotalIrqTime);
        $('#cpuInfoModelTotalNiceTime4').val(cpuInfoModelTotalNiceTime);
        $('#cpuInfoModelTotalSysTime4').val(cpuInfoModelTotalSysTime);

        // hide other ones
        // $('#profileRow').css('visibility','none');

        // show the hidden version related elements
        // $('#cpuProfileRow').css('visibility','visible');

    }

    // hide the ajax loader spinner
    // $('#ajaxLoader').hide();
}

//
// // for 5 row that updates in real time - there is a better way to do; but for now, lets proceed with this approach
// $(document).ready(
//     function() {
//         let cpuTotalUsageDBIdIndex = 5;
//         console.log("cpu total usage DB index value initialized...");
//         setInterval(function() {
//             ajaxSetUpForTotalCpuUsage2(cpuTotalUsageDBIdIndex)
//             cpuTotalUsageDBIdIndex += 2;
//         }, 5000);
//     });
//
// // this executes whenever use selects the type in the drop down box
// function ajaxSetUpForTotalCpuUsage5(cpuTotalUsageDBIdIndexArg) {
//     console.log("setting up things for pulling total cpu usage...");
//
//     // display the spinner until the ajax call being requested
//     // $('#ajaxLoader').show();
//
//     let url = "http://localhost:8080/api/ajax/cpus/" + cpuTotalUsageDBIdIndexArg;
//     console.log("Endpoint requested: ", url);
//
//     $.get(url, populateTotalCpuInfo5);
//     console.log("call made...");
// }
//
// // This function executes when version type is being selected
// function populateTotalCpuInfo5(data) {
//     console.log("populateTotalCpuInfo2 data: ", data,
//         "\npopulateTotalCpuInfo response: ", data.response);
//
//     let status = data.responseStatus;
//
//     //check the response to make sure it's ok
//     if (status == "Ok") {
//         let response = data.response;
//
//         // parse received JSON data
//         // let cpuInfoModelImage = './images/' + response.imageFile;
//         // let cpuInfoModelImage = '/images/cpulogo.jpg';
//         // console.log("cpuImage: " + cpuInfoModelImage);
//
//         let cpuInfoModelId = response.id;
//         let cpuInfoModelVendor = response.cpuVendor;
//         let cpuInfoModelName = response.cpuModel;
//         let cpuInfoModelTotalCores = response.cpuTotalCores;
//         let cpuInfoModelOperatingAt = response.cpuOperatingAt;
//
//         let cpuInfoModelTotalIdleTime = response.totalIdleTime;
//         let cpuInfoModelTotalWaitTime = response.totalWaitTime;
//         let cpuInfoModelTotalUserTime = response.totalUserTime;
//         let cpuInfoModelTotalCombinedTime = response.totalCombinedTime;
//         let cpuInfoModelTotalIrqTime = response.totalIrqTime;
//         let cpuInfoModelTotalNiceTime = response.totalNiceTime;
//         let cpuInfoModelTotalSysTime = response.totalSysTime;
//
//         // set the version model badge values
//         // $('#cpuInfoModelPic').attr("src", cpuInfoModelImage);
//         $('#cpuInfoModelHeaderName5').html(cpuInfoModelName);
//
//         // set the input field values
//         $('#cpuInfoModelId5').val(cpuInfoModelId);
//         $('#cpuInfoModelVendor5').val(cpuInfoModelVendor);
//         $('#cpuInfoModelName5').val(cpuInfoModelName);
//         $('#cpuInfoModelTotalCores5').val(cpuInfoModelTotalCores);
//         $('#cpuInfoModelOperatingAt5').val(cpuInfoModelOperatingAt);
//
//         $('#cpuInfoModelTotalIdleTime5').val(cpuInfoModelTotalIdleTime);
//         $('#cpuInfoModelTotalWaitTime5').val(cpuInfoModelTotalWaitTime);
//         $('#cpuInfoModelTotalUserTime5').val(cpuInfoModelTotalUserTime);
//         $('#cpuInfoModelTotalCombinedTime5').val(cpuInfoModelTotalCombinedTime);
//         $('#cpuInfoModelTotalIrqTime5').val(cpuInfoModelTotalIrqTime);
//         $('#cpuInfoModelTotalNiceTime5').val(cpuInfoModelTotalNiceTime);
//         $('#cpuInfoModelTotalSysTime5').val(cpuInfoModelTotalSysTime);
//
//         // hide other ones
//         // $('#profileRow').css('visibility','none');
//
//         // show the hidden version related elements
//         // $('#cpuProfileRow').css('visibility','visible');
//
//     }
//
//     // hide the ajax loader spinner
//     // $('#ajaxLoader').hide();
// }

/*
// This might be the optimal one. will do this later.
$(document).ready(
    function() {
        let cpuTotalUsageDBIndexTracker1 = 1;
        let cpuTotalUsageDBIndexTracker2 = 2;
        let cpuTotalUsageDBIndexTracker3 = 3;
        let cpuTotalUsageDBIndexTracker4 = 4;
        let cpuTotalUsageDBIndexTracker5 = 5;

        console.log("cpu total usage DB index value initialized...");
        setInterval(function() {
            // for 1st row
            ajaxSetUpForTotalCpuUsage(cpuTotalUsageDBIndexTracker1);
            cpuTotalUsageDBIndexTracker1 += 1;
        }, 3000);

        setInterval(function () {
            // for 2nd row
            ajaxSetUpForTotalCpuUsage(cpuTotalUsageDBIndexTracker2);
            cpuTotalUsageDBIndexTracker2 += 1;
        })

        setInterval(function () {
            // for 3rd row
            ajaxSetUpForTotalCpuUsage(cpuTotalUsageDBIndexTracker3);
            cpuTotalUsageDBIndexTracker3 += 1;
        })

        setInterval(function () {
            // for 4th row
            ajaxSetUpForTotalCpuUsage(cpuTotalUsageDBIndexTracker4);
            cpuTotalUsageDBIndexTracker4 += 1;
        })

        setInterval(function () {
            // for 5th row
            ajaxSetUpForTotalCpuUsage(cpuTotalUsageDBIndexTracker5);
            cpuTotalUsageDBIndexTracker5 += 1;
        })
    });

// this executes whenever use selects the type in the drop down box
function ajaxSetUpForTotalCpuUsage(globalCpuTotalUsageDBIndex) {
    console.log("setting up things for pulling total cpu usage... val: ", globalCpuTotalUsageDBIndex);

    // display the spinner until the ajax call being requested
    // $('#ajaxLoader').show();

    let url = "http://localhost:8080/api/ajax/cpus/" + globalCpuTotalUsageDBIndex;
    console.log("Endpoint requested: ", url);

    $.get(url, populateTotalCpuInfo);
    console.log("call made...");
}

// This function executes when version type is being selected
function populateTotalCpuInfo(data) {
    console.log("populateTotalCpuInfo data: ", data,
        "\npopulateTotalCpuInfo response: ", data.response);

    let status = data.responseStatus;

    //check the response to make sure it's ok
    if (status == "Ok") {
        let response = data.response;

        // parse received JSON data
        // let cpuInfoModelImage = './images/' + response.imageFile;
        // let cpuInfoModelImage = '/images/cpulogo.jpg';
        // console.log("cpuImage: " + cpuInfoModelImage);

        let cpuInfoModelId = response.id;
        let cpuInfoModelVendor = response.cpuVendor;
        let cpuInfoModelName = response.cpuModel;
        let cpuInfoModelTotalCores = response.cpuTotalCores;
        let cpuInfoModelOperatingAt = response.cpuOperatingAt;

        let cpuInfoModelTotalIdleTime = response.totalIdleTime;
        let cpuInfoModelTotalWaitTime = response.totalWaitTime;
        let cpuInfoModelTotalUserTime = response.totalUserTime;
        let cpuInfoModelTotalCombinedTime = response.totalCombinedTime;
        let cpuInfoModelTotalIrqTime = response.totalIrqTime;
        let cpuInfoModelTotalNiceTime = response.totalNiceTime;
        let cpuInfoModelTotalSysTime = response.totalSysTime;

        // set the version model badge values
        // $('#cpuInfoModelPic').attr("src", cpuInfoModelImage);
        $('#cpuInfoModelHeaderName' + globalCpuTotalUsageDBIndex.toString()).html(cpuInfoModelName);

        // set the input field values
        $('#cpuInfoModelId' + globalCpuTotalUsageDBIndex.toString()).val(cpuInfoModelId);
        $('#cpuInfoModelVendor' + globalCpuTotalUsageDBIndex.toString()).val(cpuInfoModelVendor);
        $('#cpuInfoModelName' + globalCpuTotalUsageDBIndex.toString()).val(cpuInfoModelName);
        $('#cpuInfoModelTotalCores' + globalCpuTotalUsageDBIndex.toString()).val(cpuInfoModelTotalCores);
        $('#cpuInfoModelOperatingAt' + globalCpuTotalUsageDBIndex.toString()).val(cpuInfoModelOperatingAt);

        $('#cpuInfoModelTotalIdleTime' + globalCpuTotalUsageDBIndex.toString()).val(cpuInfoModelTotalIdleTime);
        $('#cpuInfoModelTotalWaitTime' + globalCpuTotalUsageDBIndex.toString()).val(cpuInfoModelTotalWaitTime);
        $('#cpuInfoModelTotalUserTime' + globalCpuTotalUsageDBIndex.toString()).val(cpuInfoModelTotalUserTime);
        $('#cpuInfoModelTotalCombinedTime' + globalCpuTotalUsageDBIndex.toString()).val(cpuInfoModelTotalCombinedTime);
        $('#cpuInfoModelTotalIrqTime' + globalCpuTotalUsageDBIndex.toString()).val(cpuInfoModelTotalIrqTime);
        $('#cpuInfoModelTotalNiceTime' + globalCpuTotalUsageDBIndex.toString()).val(cpuInfoModelTotalNiceTime);
        $('#cpuInfoModelTotalSysTime' + globalCpuTotalUsageDBIndex.toString()).val(cpuInfoModelTotalSysTime);

        // hide other ones
        // $('#profileRow').css('visibility','none');

        // show the hidden version related elements
        // $('#cpuProfileRow').css('visibility','visible');

    }

    // hide the ajax loader spinner
    // $('#ajaxLoader').hide();
}
 */