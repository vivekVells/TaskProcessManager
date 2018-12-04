// this executes whenever use selects the type in the drop down box
function monitorTypeSelect() {
    // display the spinner until the ajax call being requested
    $('#ajaxLoader').show();

    // removing default "SELECT" option if it exists
    var defaultOption = $("#monitoryTypeIdSelect option[value='default']");
    if (defaultOption) defaultOption.remove();

    // get the selected id
    var monitorTypeId = $('#monitoryTypeIdSelect').val();

    // get the url for the ajax call
    var url = "./api/ajax/" + monitorTypeId;
    console.log(url);

    // do the ajax call
    $.get(url, populateVersionInfo);
}

// This function executes when version type is being selected
function populateVersionInfo(data) {
    console.log("data received: ", data, "\ndata response: ", data.response);
    var status = data.responseStatus;

    //check the response to make sure it's ok
    if (status == "Ok") {
        var response = data.response;

        // parse received JSON data
        var versionInfoModelImage = './images/' + response.imageFile;

        var versionInfoModelId = response.id;
        var versionInfoModelUsername = response.username;
        var versionInfoModelJavaVersion = response.javaVersion;
        var versionInfoModelJavaHome = response.javaHome;
        var versionInfoModelJavaVendor = response.javaVendor;

        // set the version model badge values
        $('#versionInfoModelPic').attr("src", versionInfoModelImage);
        $('#versionInfoModelHeaderName').html(versionInfoModelUsername);

        // set the input field values
        $('#versionInfoModelId').val(versionInfoModelId);
        $('#versionInfoModelUsername').val(versionInfoModelUsername);
        $('#versionInfoModelJavaVersion').val(versionInfoModelJavaVersion);
        $('#versionInfoModelJavaHome').val(versionInfoModelJavaHome);
        $('#versionInfoModelJavaVendor').val(versionInfoModelJavaVendor);

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