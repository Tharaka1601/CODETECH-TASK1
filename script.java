function addRecommendation() {
    // Get the message of the new recommendation
    let recommendation = document.getElementById("new_recommendation");
    // If the user has left a recommendation, display a pop-up
    if (recommendation.value != null && recommendation.value.trim() != "") {
      console.log("New recommendation added");
      //Call showPopup here
      showPopup(true);
  
      // Create a new 'recommendation' element and set its value to the user's message
      var element = document.createElement("div");
      element.setAttribute("class","recommendation");
      element.innerHTML = "\<span\>&#8220;\</span\>" + recommendation.value + "\<span\>&#8221;\</span\>";
      // Add this element to the end of the list of recommendations
      document.getElementById("all_recommendations").appendChild(element); 
      
      // Reset the value of the textarea
      recommendation.value = "";
    }
  }
  
  function showPopup() {
    // Here you can implement the logic to show a popup confirming that the recommendation has been added.
    // For example, you can create a div element for the popup and append it to the body of the document.
    var popup = document.createElement("div");
    popup.setAttribute("class", "popup");
    popup.innerHTML = "Recommendation added successfully!";
    document.body.appendChild(popup);
  
    // Set a timeout to remove the popup after a certain duration (e.g., 3 seconds)
    setTimeout(function() {
      popup.remove();
    }, 3000);
  }
  

function showPopup(bool) {
  if (bool) {
    document.getElementById('popup').style.visibility = 'visible'
  } else {
    document.getElementById('popup').style.visibility = 'hidden'
  }
}
