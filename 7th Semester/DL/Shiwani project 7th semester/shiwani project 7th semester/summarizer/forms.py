from django import forms
from typer import style

class TextForm(forms.Form):
    num_sentences = forms.IntegerField(label="Number of Output Sentences", widget=forms.NumberInput(attrs={'class': ' form-control', 'style':'background-color: white', 'placeholder': "Num of sentences"}))
    content = forms.CharField(label="Text to Summarize", widget=forms.Textarea(attrs={'placeholder':'Your Text Here', 'style' : 'width: 100%'}))
