from Algorithmia import client

class Summarizer:

    def __init__(self):
        self.algorithm = client("simFaH42Oe6xcB+ny9tjF+TiYdk1").algo("nlp/Summarizer/0.1.6")

    def summerizer(self, contents, num_sentences):
        VALID = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM:;_-,.!?()']%$@ \n"
        contents = ''.join(char for char in contents if char in VALID)
        contents.replace('\n', ' ')
        contents = ' '.join(contents.split())
        summerizer = self.algorithm.pipe([contents, num_sentences]).result
        return summerizer
