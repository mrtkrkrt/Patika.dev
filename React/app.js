import axios from "axios";

export async function getData(userId) {
  const {data: userData} = await axios("https://jsonplaceholder.typicode.com/users/" + userId);
  const {data: postData} = await axios(
    "https://jsonplaceholder.typicode.com/posts?userId=" + userId
  );
  return [userData, postData]
}

