// this executes whenever use selects the type in the drop down box
function monitorTypeSelect() {
    // display the spinner until the ajax call being requested
    $('#ajaxLoader').show();

    // removing default "SELECT" option if it exists
    var defaultOption = $("#monitoryTypeIdSelect option[value='default']");
    if (defaultOption) defaultOption.remove();

    // get the selected id
    var monitorTypeId = $('#monitoryTypeIdSelect').val();
    console.log("monitorTypeId: ", monitorTypeId);

    // get the url for the ajax call
    var url = "./api/ajax/" + monitorTypeId;
    console.log(url);

    // do the ajax call
    if(monitorTypeId.valueOf() === "versions") {
        console.log("ajax call to version block");
        $.get(url, populateVersionInfo);
    } else if (monitorTypeId.valueOf() === "cpus") {
        console.log("ajax call to cpus block");
        $.get(url, populateCpuInfo);
    } else {
        console.log("else block in ajax call");
    }
}

// This function executes when version type is being selected
function populateCpuInfo(data) {
    console.log("data received: ", data, "\ndata response: ", data.response);
    var status = data.responseStatus;

    //check the response to make sure it's ok
    if (status == "Ok") {
        var response = data.response;

        // parse received JSON data
        // var cpuInfoModelImage = './images/' + response.imageFile;
        // var cpuInfoModelImage = '/images/cpulogo.jpg';
        // console.log("cpuImage: " + cpuInfoModelImage);

        var cpuInfoModelId = response.id;
        var cpuInfoModelVendor = response.cpuVendor;
        var cpuInfoModelName = response.cpuModel;
        var cpuInfoModelTotalCores = response.cpuTotalCores;
        var cpuInfoModelOperatingAt = response.cpuOperatingAt;

        var cpuInfoModelTotalIdleTime = response.totalIdleTime;
        var cpuInfoModelTotalWaitTime = response.totalWaitTime;
        var cpuInfoModelTotalUserTime = response.totalUserTime;
        var cpuInfoModelTotalCombinedTime = response.totalCombinedTime;
        var cpuInfoModelTotalIrqTime = response.totalIrqTime;
        var cpuInfoModelTotalNiceTime = response.totalNiceTime;
        var cpuInfoModelTotalSysTime = response.totalSysTime;

        // set the version model badge values
        // $('#cpuInfoModelPic').attr("src", cpuInfoModelImage);
        $('#cpuInfoModelHeaderName').html(cpuInfoModelName);

        // set the input field values
        $('#cpuInfoModelId').val(cpuInfoModelId);
        $('#cpuInfoModelVendor').val(cpuInfoModelVendor);
        $('#cpuInfoModelName').val(cpuInfoModelName);
        $('#cpuInfoModelTotalCores').val(cpuInfoModelTotalCores);
        $('#cpuInfoModelOperatingAt').val(cpuInfoModelOperatingAt);

        $('#cpuInfoModelTotalIdleTime').val(cpuInfoModelTotalIdleTime);
        $('#cpuInfoModelTotalWaitTime').val(cpuInfoModelTotalWaitTime);
        $('#cpuInfoModelTotalUserTime').val(cpuInfoModelTotalUserTime);
        $('#cpuInfoModelTotalCombinedTime').val(cpuInfoModelTotalCombinedTime);
        $('#cpuInfoModelTotalIrqTime').val(cpuInfoModelTotalIrqTime);
        $('#cpuInfoModelTotalNiceTime').val(cpuInfoModelTotalNiceTime);
        $('#cpuInfoModelTotalSysTime').val(cpuInfoModelTotalSysTime);

        // hide other ones
        $('#profileRow').css('visibility','none');

        // show the hidden version related elements
        $('#cpuProfileRow').css('visibility','visible');

    }

    // hide the ajax loader spinner
    $('#ajaxLoader').hide();
}

// This function executes when version type is being selected
function populateVersionInfo(data) {
    console.log("data received: ", data, "\ndata response: ", data.response);
    var status = data.responseStatus;

    //check the response to make sure it's ok
    if (status == "Ok") {
        var response = data.response;

        // parse received JSON data
        // var versionInfoModelImage = './images/' + response.imageFile;
        // var versionInfoModelImage = '/images/computerlogo.png';
        // console.log("cpuImage: " + versionInfoModelImage);

        var versionInfoModelId = response.id;
        var versionInfoModelUsername = response.username;
        var versionInfoModelJavaVersion = response.javaVersion;
        var versionInfoModelJavaHome = response.javaHome;
        var versionInfoModelJavaVendor = response.javaVendor;

        var versionInfoModelSigarBuildDate = response.sigarBuildDate;
        var versionInfoModelSigarNativeBuildDate = response.sigarNativeBuildDate;
        var versionInfoModelSigarNativeVersion = response.sigarNativeVersion;
        var versionInfoModelSigarNativeScmVersion = response.sigarNativeScmVersion;
        var versionInfoModelSigarScmVersion = response.sigarScmVersion;
        var versionInfoModelSigarArchlib = response.sigarArchlib;
        var versionInfoModelSigarJavaVersion = response.sigarJavaVersion;

        var versionInfoModelHostName = response.hostName;
        var versionInfoModelFQDN = response.fqdn;

        var versionInfoModelOsDescription = response.osDescription;
        var versionInfoModelOsName = response.osName;
        var versionInfoModelOsArch = response.osArch;
        var versionInfoModelOsVendorCode = response.osVendorCode;
        var versionInfoModelOsMachine = response.osMachine;
        var versionInfoModelOsPathLevel = response.osPatchLevel;
        var versionInfoModelOsDataModel = response.osDataModel;
        var versionInfoModelOsCpuEndian = response.osCpuEndian;

        // set the version model badge values
        // $('#versionInfoModelPic').attr("src", versionInfoModelImage);
        $('#versionInfoModelHeaderName').html(versionInfoModelUsername);

        // set the input field values
        $('#versionInfoModelId').val(versionInfoModelId);
        $('#versionInfoModelUsername').val(versionInfoModelUsername);
        $('#versionInfoModelJavaVersion').val(versionInfoModelJavaVersion);
        $('#versionInfoModelJavaHome').val(versionInfoModelJavaHome);
        $('#versionInfoModelJavaVendor').val(versionInfoModelJavaVendor);

        $('#versionInfoModelSigarBuildDate').val(versionInfoModelSigarBuildDate);
        $('#versionInfoModelSigarNativeBuildDate').val(versionInfoModelSigarNativeBuildDate);
        $('#versionInfoModelSigarNativeVersion').val(versionInfoModelSigarNativeVersion);
        $('#versionInfoModelSigarNativeScmVersion').val(versionInfoModelSigarNativeScmVersion);
        $('#versionInfoModelSigarScmVersion').val(versionInfoModelSigarScmVersion);
        $('#versionInfoModelSigarArchlib').val(versionInfoModelSigarArchlib);
        $('#versionInfoModelSigarJavaVersion').val(versionInfoModelSigarJavaVersion);

        $('#versionInfoModelHostName').val(versionInfoModelHostName);
        $('#versionInfoModelFQDN').val(versionInfoModelFQDN);

        $('#versionInfoModelOsDescription').val(versionInfoModelOsDescription);
        $('#versionInfoModelOsName').val(versionInfoModelOsName);
        $('#versionInfoModelOsArch').val(versionInfoModelOsArch);
        $('#versionInfoModelOsVendorCode').val(versionInfoModelOsVendorCode);
        $('#versionInfoModelOsMachine').val(versionInfoModelOsMachine);
        $('#versionInfoModelOsPathLevel').val(versionInfoModelOsPathLevel);
        $('#versionInfoModelOsDataModel').val(versionInfoModelOsDataModel);
        $('#versionInfoModelOsCpuEndian').val(versionInfoModelOsCpuEndian);

        // show the hidden version related elements
        $('#profileRow').css('visibility','visible');
    }

    // hide the ajax loader spinner
    $('#ajaxLoader').hide();
}

$.preloadImages = function() {
    for (var i = 0; i < arguments.length; i++) {
        $("<img />").attr("src", arguments[i]);
    }
}