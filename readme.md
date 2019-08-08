# FaceRec Android

This is a library that will allow you to integrate facial recognition authentication 
into your applications easily. This is still a work in progress, if you have any feature ideas and or any recommendations on what I should implement, or if you would like to work on this with me, shoot me a message or raise an issue!

### WARNING : DOES NOT COMPILE, STILL WIP

## Features

1. Local
   1. All processing, embedding generation and classification is performed locally
   2. Ensures the privacy of your users
2. API connection 
   1. Allows you to store embeddings/etc. in an API which can then be called to classify. Acts just like a password
   2. Images are never stored on a server, once again to protect privacy of users
3. Accuracy
   1. Using Facenet's high accuracy model for the backend, it achieves a 97.9% accuracy in LFW

## How to Use
1. Establish dependency
   1. TODO : ADD TO JCENTER
2. For registering a new face,
   1. var attrs = RegisterFaceAttrs()
   2. Assign attrs (listed below)
   3. var rfView = RegisterFaceView(this, attrs)
   4. setContentView(rfView) as an onClick() for a button,
   5. The view then takes 20 pictures ( on default attrs ), generates embeddings and returns a Float[]
3. For recognizing a new face,
   1. var attrs = RecognizeFaceAttrs()
   2. Assign attrs (listed below)
   3. var recView = RecognizeFaceView(this, attrs)
   4. setContentView(recView) as an onClick() for a button,
   5. The view then takes one picture ( on default settings ) and returns the user id

## Attributes
1. Registering a new face
   1. api_url - String, API connection url to POST embedding to
   2. onBlink - Boolean, Whether to start taking pictures on blink (for security)
   3. onGesture - Boolean, Whether to start taking pictures on recognition of randomly generated gesture
   4. custom_layout - Boolean, if want to use a custom image layout
   5. layout_id - Integer ( optional ) if custom_layout, R.id of layout
2. Recognizing face
   1. api_url - String, API connection to get embeddings from (or to send to)
   2. api_get_or_check - One of Api.GET or Api.CHECK, whether to get embeddings or check on server
   2. onBlink - Boolean, Whether to start taking pictures on blink (for security)
   3. onGesture - Boolean, Whether to start taking pictures on recognition of randomly generated gesture
   4. custom_layout - Boolean, if want to use a custom image layout
   5. layout_id - Integer ( optional ) if custom_layout, R.id of layout