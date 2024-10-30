import { Request, Response } from "express";
import { IUser } from "./user.interface";

export const getUser = (_request: Request, response: Response) => {
    const user: IUser = {
        id: 1,
        name: "João",
        age: 18
    }
    response.json(user);
};

//npm i ---save-dev typescript @types/node @types/express

// npm i -g vercel
